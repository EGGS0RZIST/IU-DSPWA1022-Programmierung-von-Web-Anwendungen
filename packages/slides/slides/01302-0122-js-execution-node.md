---
layout: default
---

# JavaScript <SubHeading text="NodeJS"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-12">

- JavaScript kann außerhalb des Browsers (z.B. auf dem Server) z.B. mittels [NodeJS](https://nodejs.org/en) ausgeführt werden
- NodeJS ist eine JavaScript-Runtime und bringt zusätzliche Module mit (z.B. [HttpServer](https://nodejs.org/docs/latest/api/http.html#class-httpserver), [Prozess-Management](https://nodejs.org/docs/latest/api/child_process.html) oder [Streams](https://nodejs.org/docs/latest/api/stream.html))

</div>
<div class="col-span-12">

<Filename>hash-file.js</Filename>

<!-- prettier-ignore-start -->

```js
import { createHash } from 'node:crypto';
import { readFile } from 'node:fs/promises';

const hasher = createHash('sha1');
hasher.setEncoding('hex');

hasher.write(await readFile('package.json'));
hasher.end();

const fileHash = hasher.read();
```

```sh
node hash-file.js
```

<!-- prettier-ignore-end -->

</div>
</div>

<PageNumber/>
