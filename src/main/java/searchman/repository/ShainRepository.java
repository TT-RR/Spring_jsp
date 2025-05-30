package searchman.repository;

import java.util.ArrayList;

import searchman.entity.Shain;

public interface ShainRepository {
	//社員リストを取得
	ArrayList<Shain> findAll();
}