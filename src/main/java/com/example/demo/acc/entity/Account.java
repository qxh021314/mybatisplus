package com.example.demo.acc.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * InnoDB free: 7168 kB
 * </p>
 *
 * @author WDD
 * @since 2019-05-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Account implements Serializable {

private static final long serialVersionUID=1L;

    private String name;

    private Double money;


}
