package com.RestaurantSystemDB.RestaurantSystemDB.payload;

import com.RestaurantSystemDB.RestaurantSystemDB.Models.Items;
import com.RestaurantSystemDB.RestaurantSystemDB.Models.Orders;
import jakarta.annotation.Nullable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.List;
@Data
public class OrderDetailsPayload {
    private int quantity;

    @Nullable
    private String note;


    private Long itemId;

}
