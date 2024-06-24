---
layout: default
---

<Footer
    text="🌍 Grundlagen betrieblicher Webanwendungen"
/>

# Übung <SubHeading text="GraphQL"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- Öffne [spacex-api.fly.dev/graphql](https://spacex-api.fly.dev/graphql) im Browser
- Über das _Buch_-Symbol links kannst du das Schema anzeigen lassen
- Beginne mit einer einfachen Query und versuche, anhand des Schemas an weitere Informationen zu kommen
- Nimm dir 10min Zeit, um dich mit der GraphQL-API vertraut zu machen

</div>
<div class="col-span-6">

```graphql
query Ships {
  launches {
    __typename
    id
    launch_date_local
    mission_name
    rocket {
      rocket_name
    }
  }
}
```

</div>
</div>

<PageNumber/>
