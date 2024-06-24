import { Column, Entity, PrimaryGeneratedColumn } from "typeorm";

@Entity({
  schema: "dspwa1022",
})
export class Customer {
  @PrimaryGeneratedColumn("uuid")
  id: string;

  @Column()
  name: string;

  @Column()
  email: string;

  @Column({
    name: "created_at",
  })
  createdAt: Date;
}
