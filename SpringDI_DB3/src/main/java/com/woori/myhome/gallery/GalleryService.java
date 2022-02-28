package com.woori.myhome.gallery;

import java.util.List;

public interface GalleryService {
	List<GalleryDto> getList(GalleryDto dto);
	int getTotal(GalleryDto dto);
	void insert(GalleryDto dto );
	void update(GalleryDto dto );
	void delete(GalleryDto dto );
	GalleryDto getView(GalleryDto dto);
}
