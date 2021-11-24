package common;

public class Page {
	// 게시물 수 관련 
	private int totalRecord;
	private int recordPerPage = 10;    // 한페이지에 표시하는 게시글 수   
	private int totalPage;			   // 전체 페이지 수 
	
	// 게시글 수  관련 
	private int page;   			  // 현재 페이지 번호
	private int beginRecord;
	private int endRecord;
	
	// 페이지 번호 표시 관련
	private int pagePerBlock = 10;   // 각 블록에 표시되는 페이지 수 < 1 2 3 4 5 6 7 8 9 10 >
	private int beginPage;
	private int endPage;
	
	
	
	
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	public int getRecordPerPage() {
		return recordPerPage;
	}
	public void setRecordPerPage(int recordPerPage) {
		this.recordPerPage = recordPerPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	
	/****** 총 페이지 수 설정 ******/
	public void setTotalPage() {   				/* 수정 */ 
		totalPage = totalPage / recordPerPage;
		if(totalPage % recordPerPage != 0) {
			totalPage++;                          // 나눴을 때 남는 수 있으면 페이지 수 한개 추가하기!
		}
	}
	
	
	
	/* 게시글 수 관련 */
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getBeginRecord() {
		return beginRecord;
	}
	
	/******* 한 페이지에서 시작되는 게시물 시작 번호  *******/
	public void setBeginRecord() {								/* 수정 */ 
		beginRecord = (page-1) * pagePerBlock + 1; 
	}
	public int getEndRecord() {
		return endRecord;
	}
	
	/****** 한 페이지에서 종료되는 게시물 끝 번호 *****/
	public void setEndRecord() {							   /* 수정 */  
		endRecord = beginRecord + recordPerPage - 1;
		if(endRecord > totalRecord) {
			endRecord = totalRecord;
		}
	}
	public int getPagePerBlock() {
		return pagePerBlock;
	}
	public void setPagePerBlock(int pagePerBlock) {
		this.pagePerBlock = pagePerBlock;
	}
	public int getBeginPage() {
		return beginPage;
	}
	
	/********* BLOCK의  페이지 시작 번호 ************/
	public void setBeginPage() {  					/* 수정 */ 
		beginPage =  ((page -1 ) / pagePerBlock ) * pagePerBlock +1;
	}
	public int getEndPage() {
		return endPage;
	}
	
	/******** BLOCK의  페이지 종료 번호 *********/
	public void setEndPage() {						/* 수정 */ 
		endPage = beginPage + pagePerBlock-1;
		if(endPage>totalPage) {
			endPage = totalPage;                    // 블록의 마지막 페이지 번호. 첫줄 수식 대로 풀게되면 총 페이지수보다 종료페이지가 클수있다. 이경우엔 총페이지 수를 종료 페이지 번호에 대입한다.
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
