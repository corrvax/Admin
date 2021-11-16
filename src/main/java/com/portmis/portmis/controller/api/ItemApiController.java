package com.portmis.portmis.controller.api;

import com.portmis.portmis.controller.CrudController;
import com.portmis.portmis.model.entity.Item;
import com.portmis.portmis.model.network.request.ItemApiRequest;
import com.portmis.portmis.model.network.response.ItemApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/item")
public class ItemApiController extends CrudController<ItemApiRequest, ItemApiResponse, Item> {

}
