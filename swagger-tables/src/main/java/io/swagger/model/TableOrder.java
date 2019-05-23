package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Order;
import io.swagger.model.Table;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TableOrder
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-05T16:18:34.457Z")

public class TableOrder   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("order_id")
  private Order orderId = null;

  @JsonProperty("table_id")
  private Table tableId = null;

  @JsonProperty("is_all_day")
  private Boolean isAllDay = null;

  @JsonProperty("date_start")
  private OffsetDateTime dateStart = null;

  @JsonProperty("date_end")
  private OffsetDateTime dateEnd = null;

  public TableOrder id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TableOrder orderId(Order orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Order getOrderId() {
    return orderId;
  }

  public void setOrderId(Order orderId) {
    this.orderId = orderId;
  }

  public TableOrder tableId(Table tableId) {
    this.tableId = tableId;
    return this;
  }

  /**
   * Get tableId
   * @return tableId
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Table getTableId() {
    return tableId;
  }

  public void setTableId(Table tableId) {
    this.tableId = tableId;
  }

  public TableOrder isAllDay(Boolean isAllDay) {
    this.isAllDay = isAllDay;
    return this;
  }

  /**
   * Get isAllDay
   * @return isAllDay
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsAllDay() {
    return isAllDay;
  }

  public void setIsAllDay(Boolean isAllDay) {
    this.isAllDay = isAllDay;
  }

  public TableOrder dateStart(OffsetDateTime dateStart) {
    this.dateStart = dateStart;
    return this;
  }

  /**
   * Get dateStart
   * @return dateStart
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDateStart() {
    return dateStart;
  }

  public void setDateStart(OffsetDateTime dateStart) {
    this.dateStart = dateStart;
  }

  public TableOrder dateEnd(OffsetDateTime dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }

  /**
   * Get dateEnd
   * @return dateEnd
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDateEnd() {
    return dateEnd;
  }

  public void setDateEnd(OffsetDateTime dateEnd) {
    this.dateEnd = dateEnd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableOrder tableOrder = (TableOrder) o;
    return Objects.equals(this.id, tableOrder.id) &&
        Objects.equals(this.orderId, tableOrder.orderId) &&
        Objects.equals(this.tableId, tableOrder.tableId) &&
        Objects.equals(this.isAllDay, tableOrder.isAllDay) &&
        Objects.equals(this.dateStart, tableOrder.dateStart) &&
        Objects.equals(this.dateEnd, tableOrder.dateEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orderId, tableId, isAllDay, dateStart, dateEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableOrder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
    sb.append("    isAllDay: ").append(toIndentedString(isAllDay)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

