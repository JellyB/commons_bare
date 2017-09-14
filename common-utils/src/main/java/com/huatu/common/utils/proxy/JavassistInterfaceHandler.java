package com.huatu.common.utils.proxy;

import javassist.ClassClassPath;
import javassist.ClassPool;
import javassist.CtClass;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author hanchao
 * @date 2017/9/12 22:23
 */
@Slf4j
public class JavassistInterfaceHandler implements InterfaceHandler {
    private static ClassPool cp;
    private AtomicBoolean _lock = new AtomicBoolean(true);
    public static final String PROXY_SUFFIX = "AutoProxy";


    @Override
    public Class<?> generateClass(Class<?> inter, Map<Class,String> resultMapping) throws Exception {
        if(cp == null){
            if(_lock.compareAndSet(true,false)){
                cp = new ClassPool();
                cp.appendSystemPath();
                cp.insertClassPath(new ClassClassPath(JavassistInterfaceHandler.class));
            }
        }
        String interfaceName = inter.getName();
        String interfaceNamePath = interfaceName;
        CtClass ctInterface = cp.getCtClass(interfaceNamePath);
        String implClass = interfaceNamePath + PROXY_SUFFIX;
        CtClass cc = cp.makeClass(implClass);

        Method[] methods = inter.getMethods();

        for (int i = 0; i < methods.length; i++) {
            Method method = methods[i];
            log.debug(" generate method " + method.getName());
            JavassistUtil.dynamicImplementsMethodsFromInterface(cc, method,resultMapping);

            //generic support
            /*if (method.getGenericReturnType() instanceof ParameterizedType) {
                if (springTemplateSupport) {
                    String _refClassName = "TypeReference" + _classIndex++;
                    CtClass _refClass = cp.makeClass(_refClassName, cp.get(SPRING_REFERENCE_NAME));

                    SignatureAttribute attribute = new SignatureAttribute(_refClass.getClassFile().getConstPool(), "L" + ClassUtils.getClassByteName(SPRING_REFERENCE_NAME) + "<L" + ClassUtils.convertType2Signature(returnType) + ";>;");
                    _refClass.setAttribute("Signature", attribute.get());
                    _refClass.addConstructor(CtNewConstructor.make("public " + _refClassName + "(){super();}\n", _refClass));
                    writeCtFile(_refClass);
                    this.addSpringRefrence(returnType, _refClass.toClass().newInstance());
                }
                //jackson type

                {
                    String _refClassName = "TypeReference" + _classIndex++;
                    CtClass _refClass = cp.makeClass(_refClassName, cp.get(JACKSON_REFRENCE_NAME));

                    SignatureAttribute attribute = new SignatureAttribute(_refClass.getClassFile().getConstPool(), "L" + ClassUtils.getClassByteName(JACKSON_REFRENCE_NAME) + "<L" + ClassUtils.convertType2Signature(returnType) + ";>;");
                    _refClass.setAttribute("Signature", attribute.get());
                    _refClass.addConstructor(CtNewConstructor.make("public " + _refClassName + "(){super();}\n", _refClass));
                    writeCtFile(_refClass);
                    this.addJacksonRefrence(returnType, _refClass.toClass().newInstance());
                }
            }*/
        }
        writeCtFile(cc);
        return cc.toClass();
    }


    private static void writeCtFile(CtClass ctClass) {
        try {
            //ctClass.writeFile(new File(ProxyFactroy.class.getResource(".").getFile()).getAbsolutePath().replaceAll(packageName, ""));
            ctClass.writeFile(new File("/tmp/.classes/javassist/").getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
