# task-api

一个用于演示的 Spring Boot 3 + Java 17 项目，提供三个 REST 接口。

## 环境要求

- JDK 17+
- Maven 3.6+

## 快速开始

```bash
mvn spring-boot:run
```

服务默认监听 `http://localhost:8080`。

## 接口说明

| 方法 | 路径 | 说明 |
| --- | --- | --- |
| GET | `/api/tasks` | 查询全部任务 |
| GET | `/api/tasks/{id}` | 按 id 查询单个任务，不存在返回 404 |
| POST | `/api/tasks` | 新建任务 |

### 示例

查询全部任务：

```bash
curl http://localhost:8080/api/tasks
```

按 id 查询：

```bash
curl http://localhost:8080/api/tasks/1
```

新建任务：

```bash
curl -X POST http://localhost:8080/api/tasks \
  -H "Content-Type: application/json" \
  -d '{"title":"部署到服务器"}'
```

响应示例：

```json
{
  "id": 3,
  "title": "部署到服务器",
  "done": false,
  "createdAt": "2026-11-17T16:30:00"
}
```

## 运行测试

```bash
mvn test
```

## 项目结构

```
src/main/java/com/example/taskapi
├── TaskApiApplication.java      启动类
├── controller/TaskController.java  三个接口
├── service/TaskService.java     内存存储
└── model/Task.java              任务实体
```

## 说明

数据保存在内存中（ConcurrentHashMap），重启后清空，仅用于演示。
