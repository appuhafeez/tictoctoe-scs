package io.github.appuhafeez.tiktoktoe.enums;

public enum FilterEnum {

	PRE_FILTER("pre"), POST_FILTER("post"), ROUTE_FILTER("route"), ERROR_FILTER("error");

	private String filterType;

	FilterEnum(String filterType) {
		this.filterType = filterType;
	}

	public String getFilterType() {
		return filterType;
	}
}
