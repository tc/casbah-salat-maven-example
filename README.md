# Casbah Salat Maven Example Project

pom.xml:
```
<repository>
  <id>repo.novus snaps</id>
  <url>http://repo.novus.com/snapshots/</url>
</repository>
```

```
<dependency>
  <groupId>com.novus</groupId>
  <artifactId>salat-core_${scala.version}</artifactId>
  <version>0.0.8-SNAPSHOT</version>
</dependency>
```

## Running

```
mvn compile
mvn test
```
