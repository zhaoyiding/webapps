package demo.util;

/*
 * 分页辅助类
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
		//防止每页显示数为0，默认设置为5
		return everyPage==0?5:everyPage;
	}
	
	private static int getCurrentPage(int currentPage) {
		//当第一次访问首页的时候，此时没有currentPage参数，默认为0，所以第一次访问的时候设置当前页为1
		return currentPage==0?1:currentPage;
	}

	// 得到总页数
	private static int getTotalPage(int everyPage, int totalCount) {
		if (totalCount != 0 && totalCount % everyPage == 0) {
			return totalCount / everyPage;
		} else {
			return totalCount / everyPage + 1;
		}
	}

	// 得到本页消息起始编号
	private static int getBeginIndex(int everyPage, int currentPage) {
		return (currentPage - 1) * everyPage;
	}

	// 判断是否有上一页
	private static boolean getHasPrePage(int currentPage) {
		return currentPage != 1;
	}

	// 判断是否有下一页
	private static boolean getHasNextPage(int everyPage, int totalCount, int currentPage) {
		int totalPage = getTotalPage(everyPage, totalCount);
		return currentPage != totalPage;
	}
}
