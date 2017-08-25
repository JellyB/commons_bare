package com.huatu.utils.date;

public class TimeMark {
	private long start;
	private long current;
	public TimeMark(){
		start = System.currentTimeMillis();
		current = System.currentTimeMillis();
	}
	public void mark(){
		current = System.currentTimeMillis();
	}
	public long mills(){
		return System.currentTimeMillis()-current;
	}

	public long totalMills(){
		return System.currentTimeMillis() - start;
	}

	public long millsWithMark(){
		long result = System.currentTimeMillis()-current;
		mark();
		return result;
	}

	public void simplePrint(){
		System.out.println("total used:"+totalMills()+",last used: "+mills());
	}
}