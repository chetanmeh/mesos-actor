// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package org.apache.mesos.v1.mesos

/** *
  * Represents a single machine, which may hold one or more agents.
  *
  * NOTE: In order to match an agent to a machine, both the `hostname` and
  * `ip` must match the values advertised by the agent to the master.
  * Hostname is not case-sensitive.
  */
@SerialVersionUID(0L)
final case class MachineID(
    hostname: scala.Option[String] = None,
    ip: scala.Option[String] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[MachineID] with com.trueaccord.lenses.Updatable[MachineID] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (hostname.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, hostname.get) }
      if (ip.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, ip.get) }
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
      hostname.foreach { __v =>
        _output__.writeString(1, __v)
      };
      ip.foreach { __v =>
        _output__.writeString(2, __v)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.apache.mesos.v1.mesos.MachineID = {
      var __hostname = this.hostname
      var __ip = this.ip
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __hostname = Some(_input__.readString())
          case 18 =>
            __ip = Some(_input__.readString())
          case tag => _input__.skipField(tag)
        }
      }
      org.apache.mesos.v1.mesos.MachineID(
          hostname = __hostname,
          ip = __ip
      )
    }
    def getHostname: String = hostname.getOrElse("")
    def clearHostname: MachineID = copy(hostname = None)
    def withHostname(__v: String): MachineID = copy(hostname = Some(__v))
    def getIp: String = ip.getOrElse("")
    def clearIp: MachineID = copy(ip = None)
    def withIp(__v: String): MachineID = copy(ip = Some(__v))
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => hostname.orNull
        case 2 => ip.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => hostname.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => ip.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = org.apache.mesos.v1.mesos.MachineID
}

object MachineID extends com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.MachineID] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.MachineID] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): org.apache.mesos.v1.mesos.MachineID = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    org.apache.mesos.v1.mesos.MachineID(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[String]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[org.apache.mesos.v1.mesos.MachineID] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      org.apache.mesos.v1.mesos.MachineID(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[scala.Option[String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[String]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = MesosProto.javaDescriptor.getMessageTypes.get(12)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = MesosProto.scalaDescriptor.messages(12)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__fieldNumber)
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = org.apache.mesos.v1.mesos.MachineID(
  )
  implicit class MachineIDLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.MachineID]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, org.apache.mesos.v1.mesos.MachineID](_l) {
    def hostname: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getHostname)((c_, f_) => c_.copy(hostname = Some(f_)))
    def optionalHostname: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.hostname)((c_, f_) => c_.copy(hostname = f_))
    def ip: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getIp)((c_, f_) => c_.copy(ip = Some(f_)))
    def optionalIp: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.ip)((c_, f_) => c_.copy(ip = f_))
  }
  final val HOSTNAME_FIELD_NUMBER = 1
  final val IP_FIELD_NUMBER = 2
}
