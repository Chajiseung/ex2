package com.choa.util;

public class PageMaker {
	
	private int perPage;
	private int perBlock;
	private int curPage;
	private MakePage makePage;
	private Rowmaker rowmaker;
	
	
	public PageMaker(int curPage) {
		this(8, curPage);
	}
	
	public PageMaker(int perPage, int curPage) {
		this(perPage, 5, curPage);
	}
	
	public PageMaker(int perPage, int perBlock, int curPage) {
		this.perPage=perPage;
		this.perBlock=perBlock;
		this.curPage=curPage;
	}

	public MakePage getMakePage(int totalCount) {
		makePage = new MakePage();
		makePage.makePage(totalCount, curPage, perPage, perBlock);
		return makePage;
	}

	public Rowmaker getRowmaker(String kind, String search) {
		rowmaker = new Rowmaker();
		rowmaker.setRow(curPage, perPage);
		rowmaker.setKind(kind);
		rowmaker.setSearch(search);
		return rowmaker;
	}
		
	
	

}
