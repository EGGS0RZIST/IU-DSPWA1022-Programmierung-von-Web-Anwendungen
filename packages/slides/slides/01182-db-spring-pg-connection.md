---
layout: default
---

<Footer
    text="☕️ Java-Web-Technologien"
/>

# Datenbanken <SubHeading text="DB-Verbindung in Spring"/>

<div class="grid grid-cols-12 gap-3">
<div class="col-span-12">

- Um die entfernte Datenbank auch in unserer Java-Anwendung nutzen zu können, müssen wir die Verbindungs-Details angeben
- Das war bisher mit der H2-In-Memory-Datenbank nicht nötig, da das Programm sich intern darum gekümmert hat
- In Spring können wir eine `@Configuration`-Klasse erstellen, um die benötigten Angaben dynamisch zu laden (siehe [PostgresDataSourceConfig.java](https://github.com/volkmann-design-code/IU-DSPWA1022-Programmierung-von-Web-Anwendungen/blob/main/packages/dspwa1022/src/main/java/org/iu/dspwa1022/store/config/PostgresDataSourceConfig.java))

</div>
<div class="col-span-9">

```java
public class PostgresDataSourceConfig {
    @Bean
    @Primary
    public DataSource postgresDataSource() {
        final var dotenv = Dotenv.configure().directory("packages/dspwa1022").load();

        return DataSourceBuilder
                .create()
                .url(dotenv.get("DB_URL"))
                .username(dotenv.get("DB_USER"))
                .password(dotenv.get("DB_PASSWORD"))
                .driverClassName("org.postgresql.Driver")
                .build();
    }
}

```

</div>
<div class="col-span-3">

<Figcaption>*Code-Beispiel ist unvollständig</Figcaption>

</div>
</div>

<PageNumber/>
