# vue-back (Gradle, tomcat, jpa)
Gradle, Spring MVC, Api

## 1. Technologies and tools used:
* Java 17
* Spring 5.3.25
* Spring Boot Starter Tomcat 3.0.5
* IntelliJ IDEA 2023.1 (CE)
* Gradle 7.6.1
* Spring Boot Starter Test 3.0.5
* Lombok 1.18.26
* Spring Boot Starter Data JPA 3.0.5
* H2 Database Engine 2.1.214

## 2. How to run this project?
```
$ git clone https://github.com/ted19/spring-vue-board.git
$ cd vue-back
$ gradlew build\libs
$ java -jar -Dfile.encoding=UTF-8 vue-back-0.0.1-SNAPSHOT.war
$ visit http://localhost:8081/board/list
```
Output
```
{"transaction_time":"2023-04-20T14:56:29.6615984","result_code":"OK","description":"OK","data":[{"idx":101,"title":"게시글 제목101","contents":"게시글 내용101","author":"작성자101","created_at":"2023-03-28 11:24:00"},{"idx":100,"title":"게시글 제목100","contents":"게시글 내용100","author":"작성자100","created_at":"2023-03-28 11:24:00"},{"idx":99,"title":"게시글 제목99","contents":"게시글 내용99","author":"작성자99","created_at":"2023-03-28 11:24:00"},{"idx":98,"title":"게시글 제목98","contents":"게시글 내용98","author":"작성자98","created_at":"2023-03-28 11:24:00"},{"idx":97,"title":"게시글 제목97","contents":"게시글 내용97","author":"작성자97","created_at":"2023-03-28 11:24:00"},{"idx":96,"title":"게시글 제목96","contents":"게시글 내용96","author":"작성자96","created_at":"2023-03-28 11:24:00"},{"idx":95,"title":"게시글 제목95","contents":"게시글 내용95","author":"작성자95","created_at":"2023-03-28 11:24:00"},{"idx":94,"title":"게시글 제목94","contents":"게시글 내용94","author":"작성자94","created_at":"2023-03-28 11:24:00"},{"idx":93,"title":"게시글 제목93","contents":"게시글 내용93","author":"작성자93","created_at":"2023-03-28 11:24:00"},{"idx":92,"title":"게시글 제목92","contents":"게시글 내용92","author":"작성자92","created_at":"2023-03-28 11:24:00"}],"pagination":{"page_size":10,"page":1,"block":1,"total_list_cnt":101,"total_page_cnt":11,"total_block_cnt":2,"start_page":1,"end_page":10,"prev_block":1,"next_block":11,"start_index":0}}
```

# vue-front

## 1. Technologies and tools used:
* node v18.15.0
* npm 9.6.2
* vue cli 5.0.8
* IntelliJ IDEA 2023.1 (CE)

## 2. How to run this project?

* install nodeJs
* npm install -g @vue/cli
* vue create vue-front
* copy vue-front source to vue-front project
* npm run serve
* visit http://localhost:8080

### Customize configuration
See [Configuration Reference](https://cli.vuejs.org/config/).
