package searchman.service;

import java.util.ArrayList;

import searchman.entity.Shain;

public interface ShainService {
	//社員リストを取得
	ArrayList<Shain> findAll();
}