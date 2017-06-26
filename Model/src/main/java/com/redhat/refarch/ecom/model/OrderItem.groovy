package com.redhat.refarch.ecom.model

import groovy.transform.EqualsAndHashCode
import org.springframework.data.annotation.Id

@EqualsAndHashCode
class OrderItem implements Serializable {

    @Id
    String id
    String sku
    Integer quantity
}