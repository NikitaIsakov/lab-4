# lab-3
Information systems development. 3 lab

## Предварительные требования
Убедитесь, что у вас установлен **Maven** - для компиляции и запуска Java-кода.
Убедитесь, что у вас установлен **PostgreSQL** - для работы с базой данных.
## Компиляция проекта
Перейдите в корневой каталог проекта

Установите зависимости
```
mvn install
```

Подключитесь к PostgreSQL
```
psql -U your_username
```

Создайте базу данных:
```
CREATE DATABASE jewelry;
```

Перейдите в созданную базу данных
```
\c jewelry
```

Создайте пользователя и предоставьте ему доступ.
```
CREATE USER customer WITH ENCRYPTED PASSWORD 'root';
GRANT ALL PRIVILEGES ON DATABASE jewelry TO customer;
```

Выдайте права на таблицу созданному пользователю.
```
ALTER TABLE public.jewelry_store OWNER TO customer;
```

Запустите программу:
```
mvn spring-boot:run
```

