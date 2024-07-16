package com.InternalWorking;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.InternalWorking.Helper.MapHelper1;
import com.InternalWorking.Helper.MapHelper2;
import com.InternalWorking.Helper.MapHelper3;
import com.InternalWorking.Helper.MapHelper4;

public class SynchronizedHashMapWorking {

	public static void main(String[] args) {
//		Map<String, Integer> hashMap = new HashMap<>();
//		 Map<String, Integer> synchronous = Collections.synchronizedMap(hashMap);
		Map<String, Integer> synchronous = new ConcurrentHashMap<>();
		MapHelper1 m1 = new MapHelper1(synchronous);
		MapHelper2 m2 = new MapHelper2(synchronous);
		MapHelper3 m3 = new MapHelper3(synchronous);
		MapHelper4 m4 = new MapHelper4(synchronous);

		for (Map.Entry<String, Integer> e : synchronous.entrySet()) {
			System.out.println(e.getKey() + "  =  " + e.getValue());
		}

	}

}
