package com.example.demo.basics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortingAlgorithm implements SortingAlgorithm {


	public void sort(int[] nums) {
		// TODO Auto-generated method stub
		System.out.println("Quick Sorted!");
	}

}
