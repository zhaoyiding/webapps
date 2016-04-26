package demo.util;

/*
 * ��ҳ��Ϣ��
 */
public class Page {
	private int everyPage;// ÿҳ��ʾ����Ϣ��
	private int totalPage;// ��ҳ��
	private int totalCount;// ��Ϣ����
	private int currentPage;// ��ǰҳ
	private int beginIndex;// ��ҳ��Ϣ�����ʼ��
	private boolean hasPrePage;// �Ƿ�����һҳ
	private boolean hasNextPage;// �Ƿ�����һҳ

	public Page(int everyPage, int totalPage, int totalCount, int currentPage, int beginIndex, boolean hasPrePage,
			boolean hasNextPage) {
		super();
		this.everyPage = everyPage;
		this.totalPage = totalPage;
		this.totalCount = totalCount;
		this.currentPage = currentPage;
		this.beginIndex = beginIndex;
		this.hasPrePage = hasPrePage;
		this.hasNextPage = hasNextPage;
	}

	public int getEveryPage() {
		return everyPage;
	}

	public void setEveryPage(int everyPage) {
		this.everyPage = everyPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getBeginIndex() {
		return beginIndex;
	}

	public void setBeginIndex(int beginIndex) {
		this.beginIndex = beginIndex;
	}

	public boolean isHasPrePage() {
		return hasPrePage;
	}

	public void setHasPrePage(boolean hasPrePage) {
		this.hasPrePage = hasPrePage;
	}

	public boolean isHasNextPage() {
		return hasNextPage;
	}

	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
}
