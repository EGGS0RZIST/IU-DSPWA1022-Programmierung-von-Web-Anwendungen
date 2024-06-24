---
layout: default
---

# NestJS <SubHeading text="main.ts"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- In der Einstiegsdatei wird die Nest-Anwendung erstellt und das Hauptmodul geladen

<Filename>main.ts</Filename>

```ts
import { NestFactory } from "@nestjs/core";
import { AppModule } from "./app.module";

async function bootstrap() {
  const app = await NestFactory.create(AppModule);
  await app.listen(3000);
}

bootstrap();
```

</div>
</div>

<div class="flex gap-4 text-6xl absolute bottom left">
    <div class="i-devicon-nestjs"/>
</div>

<PageNumber/>
