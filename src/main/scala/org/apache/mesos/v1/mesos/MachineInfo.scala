// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package org.apache.mesos.v1.mesos

/** *
  * Holds information about a single machine, its `mode`, and any other
  * relevant information which may affect the behavior of the machine.
  *
  * @param unavailability
  *   Signifies that the machine may be unavailable during the given interval.
  *   See comments in `Unavailability` and for the `unavailability` fields
  *   in `Offer` and `InverseOffer` for more information.
  */
@SerialVersionUID(0L)
final case class MachineInfo(
    id: org.apache.mesos.v1.mesos.MachineID,
    mode: scala.Option[org.apache.mesos.v1.mesos.MachineInfo.Mode] = None,
    unavailability: scala.Option[org.apache.mesos.v1.mesos.Unavailability] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[MachineInfo] with com.trueaccord.lenses.Updatable[MachineInfo] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(id.serializedSize) + id.serializedSize
      if (mode.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(2, mode.get.value) }
      if (unavailability.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(unavailability.get.serializedSize) + unavailability.get.serializedSize }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      _output__.writeTag(1, 2)
      _output__.writeUInt32NoTag(id.serializedSize)
      id.writeTo(_output__)
      mode.foreach { __v =>
        _output__.writeEnum(2, __v.value)
      };
      unavailability.foreach { __v =>
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.apache.mesos.v1.mesos.MachineInfo = {
      var __id = this.id
      var __mode = this.mode
      var __unavailability = this.unavailability
      var __requiredFields0: Long = 0x1L
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __id = _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __id)
            __requiredFields0 &= 0xfffffffffffffffeL
          case 16 =>
            __mode = Some(org.apache.mesos.v1.mesos.MachineInfo.Mode.fromValue(_input__.readEnum()))
          case 26 =>
            __unavailability = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __unavailability.getOrElse(org.apache.mesos.v1.mesos.Unavailability.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
      org.apache.mesos.v1.mesos.MachineInfo(
          id = __id,
          mode = __mode,
          unavailability = __unavailability
      )
    }
    def withId(__v: org.apache.mesos.v1.mesos.MachineID): MachineInfo = copy(id = __v)
    def getMode: org.apache.mesos.v1.mesos.MachineInfo.Mode = mode.getOrElse(org.apache.mesos.v1.mesos.MachineInfo.Mode.UP)
    def clearMode: MachineInfo = copy(mode = None)
    def withMode(__v: org.apache.mesos.v1.mesos.MachineInfo.Mode): MachineInfo = copy(mode = Some(__v))
    def getUnavailability: org.apache.mesos.v1.mesos.Unavailability = unavailability.getOrElse(org.apache.mesos.v1.mesos.Unavailability.defaultInstance)
    def clearUnavailability: MachineInfo = copy(unavailability = None)
    def withUnavailability(__v: org.apache.mesos.v1.mesos.Unavailability): MachineInfo = copy(unavailability = Some(__v))
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => id
        case 2 => mode.map(_.javaValueDescriptor).orNull
        case 3 => unavailability.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => id.toPMessage
        case 2 => mode.map(__e => _root_.scalapb.descriptors.PEnum(__e.scalaValueDescriptor)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => unavailability.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = org.apache.mesos.v1.mesos.MachineInfo
}

object MachineInfo extends com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.MachineInfo] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.MachineInfo] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): org.apache.mesos.v1.mesos.MachineInfo = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    org.apache.mesos.v1.mesos.MachineInfo(
      __fieldsMap(__fields.get(0)).asInstanceOf[org.apache.mesos.v1.mesos.MachineID],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor]].map(__e => org.apache.mesos.v1.mesos.MachineInfo.Mode.fromValue(__e.getNumber)),
      __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[org.apache.mesos.v1.mesos.Unavailability]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[org.apache.mesos.v1.mesos.MachineInfo] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      org.apache.mesos.v1.mesos.MachineInfo(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).get.as[org.apache.mesos.v1.mesos.MachineID],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[_root_.scalapb.descriptors.EnumValueDescriptor]]).map(__e => org.apache.mesos.v1.mesos.MachineInfo.Mode.fromValue(__e.number)),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[scala.Option[org.apache.mesos.v1.mesos.Unavailability]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = MesosProto.javaDescriptor.getMessageTypes.get(13)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = MesosProto.scalaDescriptor.messages(13)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => __out = org.apache.mesos.v1.mesos.MachineID
      case 3 => __out = org.apache.mesos.v1.mesos.Unavailability
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 2 => org.apache.mesos.v1.mesos.MachineInfo.Mode
    }
  }
  lazy val defaultInstance = org.apache.mesos.v1.mesos.MachineInfo(
    id = org.apache.mesos.v1.mesos.MachineID.defaultInstance
  )
  sealed trait Mode extends _root_.com.trueaccord.scalapb.GeneratedEnum {
    type EnumType = Mode
    def isUp: Boolean = false
    def isDraining: Boolean = false
    def isDown: Boolean = false
    def companion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[Mode] = org.apache.mesos.v1.mesos.MachineInfo.Mode
  }
  
  object Mode extends _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[Mode] {
    implicit def enumCompanion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[Mode] = this
    @SerialVersionUID(0L)
    case object UP extends Mode {
      val value = 1
      val index = 0
      val name = "UP"
      override def isUp: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object DRAINING extends Mode {
      val value = 2
      val index = 1
      val name = "DRAINING"
      override def isDraining: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object DOWN extends Mode {
      val value = 3
      val index = 2
      val name = "DOWN"
      override def isDown: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case class Unrecognized(value: Int) extends Mode with _root_.com.trueaccord.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.Seq(UP, DRAINING, DOWN)
    def fromValue(value: Int): Mode = value match {
      case 1 => UP
      case 2 => DRAINING
      case 3 => DOWN
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = org.apache.mesos.v1.mesos.MachineInfo.javaDescriptor.getEnumTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = org.apache.mesos.v1.mesos.MachineInfo.scalaDescriptor.enums(0)
  }
  implicit class MachineInfoLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.MachineInfo]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, org.apache.mesos.v1.mesos.MachineInfo](_l) {
    def id: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.MachineID] = field(_.id)((c_, f_) => c_.copy(id = f_))
    def mode: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.MachineInfo.Mode] = field(_.getMode)((c_, f_) => c_.copy(mode = Some(f_)))
    def optionalMode: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[org.apache.mesos.v1.mesos.MachineInfo.Mode]] = field(_.mode)((c_, f_) => c_.copy(mode = f_))
    def unavailability: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.Unavailability] = field(_.getUnavailability)((c_, f_) => c_.copy(unavailability = Some(f_)))
    def optionalUnavailability: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[org.apache.mesos.v1.mesos.Unavailability]] = field(_.unavailability)((c_, f_) => c_.copy(unavailability = f_))
  }
  final val ID_FIELD_NUMBER = 1
  final val MODE_FIELD_NUMBER = 2
  final val UNAVAILABILITY_FIELD_NUMBER = 3
}
