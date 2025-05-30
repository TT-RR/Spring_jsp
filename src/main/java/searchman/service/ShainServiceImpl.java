package searchman.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import searchman.entity.Shain;
import searchman.repository.ShainRepository;

@Service
public class ShainServiceImpl implements ShainService {
	@Autowired
	ShainRepository shainRepository;

	@Override
	public ArrayList<Shain> findAll() {
		
		// 社員リストを戻す
		return shainRepository.findAll();
		
	}
}
