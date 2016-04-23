package demo.util;

/*
 * ��ҳ������
 */
public class PageUtil {
	public static Page getPage(int everyP, int totalCount, int currentP) {
		int everyPage=getEveryPage(everyP);
		int currentPage=getCurrentPage(currentP);
		int totalPage = getTotalPage(everyPage, totalCount);
		int beginIndex = getBeginIndex(everyPage, currentPage);
		boolean hasPrePage = getHasPrePage(currentPage);
		boolean hasNextPage = getHasNextPage(everyPage, totalCount, currentPage);
		return new Page(everyPage, totalPage, totalCount, currentPage, beginIndex, hasPrePage, hasNextPage);
	}
	
	private static int getEveryPage(int everyPage) {
		//��ֹÿҳ��ʾ��Ϊ0��Ĭ������Ϊ5
		return everyPage==0?5:everyPage;
	}
	
	private static int getCurrentPage(int currentPage) {
		//����һ�η�����ҳ��ʱ�򣬴�ʱû��currentPage������Ĭ��Ϊ0�����Ե�һ�η��ʵ�ʱ�����õ�ǰҳΪ1
		return currentPage==0?1:currentPage;
	}

	// �õ���ҳ��
	private static int getTotalPage(int everyPage, int totalCount) {
		if (totalCount != 0 && totalCount % everyPage == 0) {
			return totalCount / everyPage;
		} else {
			return totalCount / everyPage + 1;
		}
	}

	// �õ���ҳ��Ϣ��ʼ���
	private static int getBeginIndex(int everyPage, int currentPage) {
		return (currentPage - 1) * everyPage;
	}

	// �ж��Ƿ�����һҳ
	private static boolean getHasPrePage(int currentPage) {
		return currentPage != 1;
	}

	// �ж��Ƿ�����һҳ
	private static boolean getHasNextPage(int everyPage, int totalCount, int currentPage) {
		int totalPage = getTotalPage(everyPage, totalCount);
		return currentPage != totalPage;
	}
}
