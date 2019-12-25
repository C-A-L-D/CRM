package com.sc.entity;

import java.util.ArrayList;

public class ListArr {

	private ArrayList<SysPowerinfo> list1;
	
	private ArrayList<SysPowerinfo> list2;

	public ListArr(ArrayList<SysPowerinfo> list1, ArrayList<SysPowerinfo> list2) {
		super();
		this.list1 = list1;
		this.list2 = list2;
	}

	public ArrayList<SysPowerinfo> getList1() {
		return list1;
	}

	public void setList1(ArrayList<SysPowerinfo> list1) {
		this.list1 = list1;
	}

	public ArrayList<SysPowerinfo> getList2() {
		return list2;
	}

	public void setList2(ArrayList<SysPowerinfo> list2) {
		this.list2 = list2;
	}

	@Override
	public String toString() {
		return "ListArr [list1=" + list1 + ", list2=" + list2 + "]";
	}

}
