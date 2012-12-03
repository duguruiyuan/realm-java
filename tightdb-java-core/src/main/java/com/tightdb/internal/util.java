package com.tightdb.internal;

import java.util.Scanner;

import com.tightdb.lib.TightDB;

public class util {
	
	public static final long REQUIRED_JNI_VERSION = 15;

	static {
		TightDB.loadLibrary();
	}
	
	public static final long INFINITE = nativeGetInfiniteValue();
	
	static native long nativeGetInfiniteValue();
	
	public static long getNativeMemUsage() {
		return nativeGetMemUsage();
	}
	static native long nativeGetMemUsage();

	public static boolean versionCompatible() {
		return (nativeGetVersion() == REQUIRED_JNI_VERSION);
	}

	static native int nativeGetVersion();
	
	// Set to level=1 to get some trace from JNI native part.
	public static void setDebugLevel(int level) {
		nativeSetDebugLevel(level);
	}
	static native void nativeSetDebugLevel(int level);
	
	static void javaPrint(String txt) {	
		System.out.print(txt);
	}
	
	public static void waitForEnter() {
		System.out.println("Press Enter to continue...");
		Scanner sc = new Scanner(System.in);
	       while(!sc.nextLine().equals(""));
	}
}