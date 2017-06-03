// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package org.apache.mesos.v1.maintenance

import org.apache.mesos.v1.maintenance

/** *
  * A set of machines scheduled to go into maintenance
  * in the same `unavailability`.
  *
  * @param machineIds
  *   Machines affected by this maintenance window.
  * @param unavailability
  *   Interval during which this set of machines is expected to be down.
  */
@SerialVersionUID(0L)
final case class Window(
    machineIds: _root_.scala.collection.Seq[org.apache.mesos.v1.mesos.MachineID] = _root_.scala.collection.Seq.empty,
    unavailability: org.apache.mesos.v1.mesos.Unavailability
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Window] with com.trueaccord.lenses.Updatable[Window] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      machineIds.foreach(machineIds => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(machineIds.serializedSize) + machineIds.serializedSize)
      __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(unavailability.serializedSize) + unavailability.serializedSize
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
      machineIds.foreach { __v =>
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      _output__.writeTag(2, 2)
      _output__.writeUInt32NoTag(unavailability.serializedSize)
      unavailability.writeTo(_output__)
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): Window = {
      val __machineIds = (_root_.scala.collection.immutable.Vector.newBuilder[org.apache.mesos.v1.mesos.MachineID] ++= this.machineIds)
      var __unavailability = this.unavailability
      var __requiredFields0: Long = 0x1L
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __machineIds += _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, org.apache.mesos.v1.mesos.MachineID.defaultInstance)
          case 18 =>
            __unavailability = _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __unavailability)
            __requiredFields0 &= 0xfffffffffffffffeL
          case tag => _input__.skipField(tag)
        }
      }
      if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
      maintenance.Window(
          machineIds = __machineIds.result(),
          unavailability = __unavailability
      )
    }
    def clearMachineIds = copy(machineIds = _root_.scala.collection.Seq.empty)
    def addMachineIds(__vs: org.apache.mesos.v1.mesos.MachineID*): Window = addAllMachineIds(__vs)
    def addAllMachineIds(__vs: TraversableOnce[org.apache.mesos.v1.mesos.MachineID]): Window = copy(machineIds = machineIds ++ __vs)
    def withMachineIds(__v: _root_.scala.collection.Seq[org.apache.mesos.v1.mesos.MachineID]): Window = copy(machineIds = __v)
    def withUnavailability(__v: org.apache.mesos.v1.mesos.Unavailability): Window = copy(unavailability = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => machineIds
        case 2 => unavailability
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(machineIds.map(_.toPMessage)(_root_.scala.collection.breakOut))
        case 2 => unavailability.toPMessage
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = maintenance.Window
}

object Window extends com.trueaccord.scalapb.GeneratedMessageCompanion[Window] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[Window] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): Window = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    maintenance.Window(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.collection.Seq[org.apache.mesos.v1.mesos.MachineID]],
      __fieldsMap(__fields.get(1)).asInstanceOf[org.apache.mesos.v1.mesos.Unavailability]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[Window] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      maintenance.Window(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.collection.Seq[org.apache.mesos.v1.mesos.MachineID]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).get.as[org.apache.mesos.v1.mesos.Unavailability]
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = MaintenanceProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = MaintenanceProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => __out = org.apache.mesos.v1.mesos.MachineID
      case 2 => __out = org.apache.mesos.v1.mesos.Unavailability
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = maintenance.Window(
    unavailability = org.apache.mesos.v1.mesos.Unavailability.defaultInstance
  )
  implicit class WindowLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, Window]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, Window](_l) {
    def machineIds: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[org.apache.mesos.v1.mesos.MachineID]] = field(_.machineIds)((c_, f_) => c_.copy(machineIds = f_))
    def unavailability: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.Unavailability] = field(_.unavailability)((c_, f_) => c_.copy(unavailability = f_))
  }
  final val MACHINE_IDS_FIELD_NUMBER = 1
  final val UNAVAILABILITY_FIELD_NUMBER = 2
}
