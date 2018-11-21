/*
 * Hidden Switch Spellsource API
 * The Spellsource API for matchmaking, user accounts, collections management and more.  To get started, create a user account and make sure to include the entirety of the returned login token as the X-Auth-Token header. You can reuse this token, or login for a new one.  ClientToServerMessage and ServerToClientMessage are used for the realtime game state and actions two-way websocket interface for actually playing a game. Envelope is used for the realtime API services. 
 *
 * OpenAPI spec version: 2.1.0
 * Contact: ben@hiddenswitch.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hiddenswitch.spellsource.client.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * An object that indicates the player has a pending invitation to a game. 
 */
@ApiModel(description = "An object that indicates the player has a pending invitation to a game. ")

public class Invite implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("_id")
  private String id = null;

  @JsonProperty("fromUserId")
  private String fromUserId = null;

  @JsonProperty("toUserId")
  private String toUserId = null;

  @JsonProperty("toName")
  private String toName = null;

  @JsonProperty("fromName")
  private String fromName = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("queueId")
  private String queueId = null;

  @JsonProperty("friendId")
  private String friendId = null;

  @JsonProperty("expiresAt")
  private Long expiresAt = null;

  /**
   * Indicates the status of the invite.  * UNDELIVERED: The invitation was created and is awaiting delivery, either due to ordinary networking delay    or because the recipient is not yet online.  * PENDING: The invitation is delivered and awaiting a response.  * TIMEOUT: The recipient did not respond by the expiration time and the invitation expired.  * ACCEPTED: The recipient accepted the invitation. The sender should enter the queue if they haven&#39;t already    done so.  * REJECTED: The recipient rejected the invitation.  * CANCELLED: The sender cancelled the invitation. 
   */
  public enum StatusEnum {
    UNDELIVERED("UNDELIVERED"),
    
    PENDING("PENDING"),
    
    TIMEOUT("TIMEOUT"),
    
    ACCEPTED("ACCEPTED"),
    
    REJECTED("REJECTED"),
    
    CANCELLED("CANCELLED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  public Invite id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the invite. 
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the invite. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Invite fromUserId(String fromUserId) {
    this.fromUserId = fromUserId;
    return this;
  }

   /**
   * The user ID from whom the invite originates 
   * @return fromUserId
  **/
  @ApiModelProperty(value = "The user ID from whom the invite originates ")
  public String getFromUserId() {
    return fromUserId;
  }

  public void setFromUserId(String fromUserId) {
    this.fromUserId = fromUserId;
  }

  public Invite toUserId(String toUserId) {
    this.toUserId = toUserId;
    return this;
  }

   /**
   * The user ID to whom the invite is addressed 
   * @return toUserId
  **/
  @ApiModelProperty(value = "The user ID to whom the invite is addressed ")
  public String getToUserId() {
    return toUserId;
  }

  public void setToUserId(String toUserId) {
    this.toUserId = toUserId;
  }

  public Invite toName(String toName) {
    this.toName = toName;
    return this;
  }

   /**
   * The name of the user to whom the invite is addressed 
   * @return toName
  **/
  @ApiModelProperty(value = "The name of the user to whom the invite is addressed ")
  public String getToName() {
    return toName;
  }

  public void setToName(String toName) {
    this.toName = toName;
  }

  public Invite fromName(String fromName) {
    this.fromName = fromName;
    return this;
  }

   /**
   * The user from whom the invite originates 
   * @return fromName
  **/
  @ApiModelProperty(value = "The user from whom the invite originates ")
  public String getFromName() {
    return fromName;
  }

  public void setFromName(String fromName) {
    this.fromName = fromName;
  }

  public Invite message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The description of this invite. Typically includes the queue contents and possibly a note from the user. 
   * @return message
  **/
  @ApiModelProperty(value = "The description of this invite. Typically includes the queue contents and possibly a note from the user. ")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Invite queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }

   /**
   * When set, indicates this is an invitation to play a game. The queue ID to put into the matchmaking request to fulfill this invite. 
   * @return queueId
  **/
  @ApiModelProperty(value = "When set, indicates this is an invitation to play a game. The queue ID to put into the matchmaking request to fulfill this invite. ")
  public String getQueueId() {
    return queueId;
  }

  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  public Invite friendId(String friendId) {
    this.friendId = friendId;
    return this;
  }

   /**
   * When set, indicates this is an invitation to become friends. 
   * @return friendId
  **/
  @ApiModelProperty(value = "When set, indicates this is an invitation to become friends. ")
  public String getFriendId() {
    return friendId;
  }

  public void setFriendId(String friendId) {
    this.friendId = friendId;
  }

  public Invite expiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * An expiration timestamp. 
   * @return expiresAt
  **/
  @ApiModelProperty(value = "An expiration timestamp. ")
  public Long getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
  }

  public Invite status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the status of the invite.  * UNDELIVERED: The invitation was created and is awaiting delivery, either due to ordinary networking delay    or because the recipient is not yet online.  * PENDING: The invitation is delivered and awaiting a response.  * TIMEOUT: The recipient did not respond by the expiration time and the invitation expired.  * ACCEPTED: The recipient accepted the invitation. The sender should enter the queue if they haven&#39;t already    done so.  * REJECTED: The recipient rejected the invitation.  * CANCELLED: The sender cancelled the invitation. 
   * @return status
  **/
  @ApiModelProperty(value = "Indicates the status of the invite.  * UNDELIVERED: The invitation was created and is awaiting delivery, either due to ordinary networking delay    or because the recipient is not yet online.  * PENDING: The invitation is delivered and awaiting a response.  * TIMEOUT: The recipient did not respond by the expiration time and the invitation expired.  * ACCEPTED: The recipient accepted the invitation. The sender should enter the queue if they haven't already    done so.  * REJECTED: The recipient rejected the invitation.  * CANCELLED: The sender cancelled the invitation. ")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invite invite = (Invite) o;
    return Objects.equals(this.id, invite.id) &&
        Objects.equals(this.fromUserId, invite.fromUserId) &&
        Objects.equals(this.toUserId, invite.toUserId) &&
        Objects.equals(this.toName, invite.toName) &&
        Objects.equals(this.fromName, invite.fromName) &&
        Objects.equals(this.message, invite.message) &&
        Objects.equals(this.queueId, invite.queueId) &&
        Objects.equals(this.friendId, invite.friendId) &&
        Objects.equals(this.expiresAt, invite.expiresAt) &&
        Objects.equals(this.status, invite.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fromUserId, toUserId, toName, fromName, message, queueId, friendId, expiresAt, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invite {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fromUserId: ").append(toIndentedString(fromUserId)).append("\n");
    sb.append("    toUserId: ").append(toIndentedString(toUserId)).append("\n");
    sb.append("    toName: ").append(toIndentedString(toName)).append("\n");
    sb.append("    fromName: ").append(toIndentedString(fromName)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    friendId: ").append(toIndentedString(friendId)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

