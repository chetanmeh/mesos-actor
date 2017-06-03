// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package org.apache.mesos.v1.maintenance

import org.apache.mesos.v1.maintenance

/** *
  * A list of maintenance windows.
  * For example, this may represent a rolling restart of agents.
  */
@SerialVersionUID(0L)
final case class Schedule(
    windows: _root_.scala.collection.Seq[Window] = _root_.scala.collection.Seq.empty
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Schedule] with com.trueaccord.lenses.Updatable[Schedule] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      windows.foreach(windows => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(windows.serializedSize) + windows.serializedSize)
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
      windows.foreach { __v =>
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): Schedule = {
      val __windows = (_root_.scala.collection.immutable.Vector.newBuilder[Window] ++= this.windows)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __windows += _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, maintenance.Window.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      maintenance.Schedule(
          windows = __windows.result()
      )
    }
    def clearWindows = copy(windows = _root_.scala.collection.Seq.empty)
    def addWindows(__vs: Window*): Schedule = addAllWindows(__vs)
    def addAllWindows(__vs: TraversableOnce[Window]): Schedule = copy(windows = windows ++ __vs)
    def withWindows(__v: _root_.scala.collection.Seq[Window]): Schedule = copy(windows = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => windows
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(windows.map(_.toPMessage)(_root_.scala.collection.breakOut))
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = maintenance.Schedule
}

object Schedule extends com.trueaccord.scalapb.GeneratedMessageCompanion[Schedule] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[Schedule] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): Schedule = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    maintenance.Schedule(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.collection.Seq[Window]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[Schedule] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      maintenance.Schedule(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.collection.Seq[Window]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = MaintenanceProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = MaintenanceProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => __out = maintenance.Window
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = maintenance.Schedule(
  )
  implicit class ScheduleLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, Schedule]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, Schedule](_l) {
    def windows: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[Window]] = field(_.windows)((c_, f_) => c_.copy(windows = f_))
  }
  final val WINDOWS_FIELD_NUMBER = 1
}
