package searchman.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import searchman.entity.Shain;

@Repository
public class ShainRepositoryImpl implements ShainRepository {

	@Override
	public ArrayList<Shain> findAll() {
		// 社員リストを作る
		ArrayList<Shain> shainList = new ArrayList<>();

		//社員1を作る
		Shain shain1 = new Shain();
		shain1.setId(101);
		shain1.setName("鈴木義信");
		shain1.setSei("男");
		shain1.setNen(2003);
		shain1.setAddress("宮城県仙台市");
		//社員リストに追加
		shainList.add(shain1);

		// //社員2を作る
		Shain shain2 = new Shain();
		shain2.setId(102);
		shain2.setName("佐藤香織");
		shain2.setSei("女");
		shain2.setNen(2004);
		shain2.setAddress("福岡県福岡市");
		//社員リストに追加
		shainList.add(shain2);

		//社員リストを戻す
		return shainList;
	}

}
