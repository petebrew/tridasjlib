# tridasjlib

Java library generated from the TRiDaS XML schema.

## GitHub Packages

Published artifacts are available from:

`https://maven.pkg.github.com/petebrew/tridasjlib`

### Maven repository

Add this repository to your `pom.xml`:

```xml
<repositories>
  <repository>
    <id>github</id>
    <url>https://maven.pkg.github.com/petebrew/tridasjlib</url>
  </repository>
</repositories>
```

### Maven credentials

Add a `github` server entry to `~/.m2/settings.xml`:

```xml
<servers>
  <server>
    <id>github</id>
    <username>YOUR_GITHUB_USERNAME</username>
    <password>YOUR_GITHUB_TOKEN</password>
  </server>
</servers>
```

The token should include:

- `read:packages`
- `write:packages` for publishing
- `repo`
- `read:org`

### Dependency

Use the published library with:

```xml
<dependency>
  <groupId>org.tridas</groupId>
  <artifactId>tridasjlib</artifactId>
  <version>2.0.0</version>
</dependency>
```

### Legacy helper artifacts

The repository also publishes the legacy build-time helper artifacts used by JAXB/XJC generation:

- `com.sun.tools.xjc:collection-setter-injector:0.1`
- `org.jvnet.jaxb2_commons:xjc-if-ins:0.5.2`
- `org.tridas.schema:tridasaandi:1.0`
- `org.tridas.schema:tridas-annotations:1.0`

Bundled copies remain under [Libraries](Libraries) as a fallback for manual local installation.
