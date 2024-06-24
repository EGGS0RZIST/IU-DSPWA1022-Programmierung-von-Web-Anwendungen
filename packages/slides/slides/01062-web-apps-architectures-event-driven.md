---
layout: default
---

<!-- <Footer
    text="🌍 Grundlagen betrieblicher Webanwendungen"
/> -->

# Event-Driven <SubHeading text="Architekturen"/>

<div class="grid grid-cols-12">
<div class="col-span-12">

- Bei den bisherigen Architekturen kommunizieren die Dienste direkt (_Request-Response_) miteinander und sind dadurch voneinander abhängig
- Alternativ kann das Zusammenspiel der Services _eventbasiert_ aufgebaut werden
- Daten werden in _Event-Streams_ gehalten und interessierte Services _abonnieren_ den jeweiligen Stream
- Die Dienste sind dadurch unabhängig und bspw. auch resistent gegen den Ausfall einzelner Dienste
- Beispiel: [Apache Kafka](https://kafka.apache.org/)

</div>
<div class="col-span-12">

```mermaid
%%{init: {"flowchart": {"htmlLabels": false}} }%%
flowchart LR
  EventBus[[Event Bus]]
  Storefront{{Storefront}}
  AnalyticsService{{Analytics Service}}
  InventoryService{{Inventory Service}}
  AnalyticsDatabase[(Analytics Database)]
  InventoryDatabase[(Inventory Database)]
  NotificationsService{{Notifications Service}}
  NotificationsAPI{{External Notification APIs}}

  Customer -->|Places Order| Storefront
  Storefront -->|Order Placed Event| EventBus

  EventBus -.->|Subscribe| InventoryService
  EventBus -.->|Subscribe| NotificationsService
  EventBus -.->|Subscribe| AnalyticsService

  AnalyticsService -->|Update| AnalyticsDatabase
  InventoryService -->|Update| InventoryDatabase
  NotificationsService -->|Trigger| NotificationsAPI
```

<Figcaption>Beispiel für eine Event-Driven-Architektur</Figcaption>

</div>
</div>

<PageNumber/>
