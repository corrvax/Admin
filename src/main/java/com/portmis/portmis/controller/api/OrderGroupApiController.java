package com.portmis.portmis.controller.api;

import com.portmis.portmis.controller.CrudController;
import com.portmis.portmis.model.entity.OrderGroup;
import com.portmis.portmis.model.network.request.OrderGroupApiRequest;
import com.portmis.portmis.model.network.response.OrderGroupApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orderGroup")
public class OrderGroupApiController extends CrudController<OrderGroupApiRequest, OrderGroupApiResponse, OrderGroup> {


}
