# 引数にModelが指定されている理由
`Model model`

何故引数を受け取る場所にビューに渡す構造体情報を定義しているのと思う

### 結果

**引数を書くことで、Spring に「この値ちょうだい」と伝えている**

- @RequestParam("id") int id → リクエストの中から "id" パラメータを取得して渡してくれ

- Model model → Springさん、Model オブジェクトを用意して渡してくれ

呼び出し元が見えないだけで、Springがちゃんと値を「渡して」います。

```
@GetMapping("/update")
	public String update(
			@RequestParam("id") int id,
			Model model) {					// Springさん、Model オブジェクトを用意して渡してくれ
		//パラメータ値を表示
		System.out.println("id:" + id);

		//社員を作成
		Shain shain = new Shain();
		shain.setId(102);
		shain.setName("鈴木義信");
		shain.setSei("男");
		shain.setNen(2003);
		shain.setAddress("宮城県仙台市");

		// JSPに渡す(データを格納)
		model.addAttribute("shain", shain);

		 return "update";
	}
```