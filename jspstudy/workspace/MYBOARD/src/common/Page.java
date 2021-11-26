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
	
	
	
	public void setPageEntity(int totalRecord, int page) {
		this.totalRecord = totalRecord;
		this.beginPage = page;
		
		// totalPage 
		totalPage = totalRecord / recordPerPage;
		if (totalRecord % recordPerPage != 0) {
			totalPage++;
		}
	
		// beginRecord~endReord => 각 페이지에 나타나는 게시물번호
		 beginRecord = (page-1) * recordPerPage + 1;
		 endRecord = beginRecord + recordPerPage - 1;
		 endRecord = (totalRecord < endRecord) ? totalRecord : endRecord;
		
		 // block의 페이지 번호 
		 beginPage = ((page-1) / pagePerBlock) * pagePerBlock+1;
		 endPage = beginPage + pagePerBlock - 1;
		 endPage = (totalPage < endPage) ? totalPage : endPage;

	}
					// 주소값을 보내서 이미지보드, qna보드, 공지사항 보드 한번에 처리 가능하게 만든다!
	public String getPageEntity(String path) {
		StringBuilder sb = new StringBuilder();
		String concat = path.contains("?") ? "&" : "?";
		
		// 이전 페이지 이동
		if(page == 1) {
			sb.append("<span class=\"page_prev\">PREV&nbsp;&nbsp;</span>");
		} else {
			sb.append("<a class=\"page_prev\"  href=\""+path+concat +"page="+(page-1)+"\">PREV&nbsp;</a>");
		}
		
		// 페이지를 누르면 페이지로 이동 
		for (int i = beginPage; i <= endPage; i++) {
			if (page == i) {
				sb.append(i + "&nbsp;");
			} else {
				if( path.contains("?")) {
					sb.append("<a href=\""+path+"&page=" + i + "\">&nbsp;" + i + "</a>&nbsp;&nbsp;");					
				} else {
					sb.append("<a href=\""+path+"?page=" + i + "\">&nbsp;" + i + "</a>&nbsp;&nbsp;");
				}
			}
		}
		// 다음 페이지 이동 
		if(endPage == totalPage) {
			sb.append("<span class=\"page_next\">&nbsp;NEXT</span>");
		} else {
			sb.append("<a class=\"page_next\"  href=\""+path+concat +"page="+(page+1)+"\">NEXT</a>");
		}
		return sb.toString();
	}
	
	
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
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getBeginRecord() {
		return beginRecord;
	}
	public void setBeginRecord(int beginRecord) {
		this.beginRecord = beginRecord;
	}
	public int getEndRecord() {
		return endRecord;
	}
	public void setEndRecord(int endRecord) {
		this.endRecord = endRecord;
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
	public void setBeginPage(int beginPage) {
		this.beginPage = beginPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	
}
