package com.vgam.vue.back;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VueBackboardApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void createImportSql() {
		String sql = "INSERT INTO BOARD (IDX, TITLE, CONTENTS, AUTHOR, CREATED_AT) VALUES (1, '게시글 제목1', '게시글 내용1', '작성자1', '2022-02-18 23:24:00');";
		for (int i = 1; i <= 101; i++) {
			String sql1 = "INSERT INTO BOARD (IDX, TITLE, CONTENTS, AUTHOR, CREATED_AT) VALUES (" + i;
			String sql2 = ", '게시글 제목" + i;
			String sql3 = "', '게시글 내용" + i;
			String sql4 = "', '작성자" + i;
			String sql5 = "', '2023-03-28 23:24:00');";
			System.out.println(sql1 + sql2 + sql3 + sql4 + sql5);
		}
	}
}
