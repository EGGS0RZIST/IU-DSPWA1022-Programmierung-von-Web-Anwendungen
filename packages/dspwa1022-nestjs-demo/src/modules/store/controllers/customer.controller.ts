import { Controller, Get } from "@nestjs/common";
import { CustomerService } from "../services/customer.service";

@Controller("store/customers")
export class CustomerController {
  constructor(private readonly customerService: CustomerService) {}

  @Get()
  async findAll() {
    return this.customerService.findAll();
  }

  @Get(":id")
  async findOne(id: string) {
    return this.customerService.findOne(id);
  }
}
