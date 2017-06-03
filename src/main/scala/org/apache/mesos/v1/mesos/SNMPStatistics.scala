// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package org.apache.mesos.v1.mesos

@SerialVersionUID(0L)
final case class SNMPStatistics(
    ipStats: scala.Option[org.apache.mesos.v1.mesos.IpStatistics] = None,
    icmpStats: scala.Option[org.apache.mesos.v1.mesos.IcmpStatistics] = None,
    tcpStats: scala.Option[org.apache.mesos.v1.mesos.TcpStatistics] = None,
    udpStats: scala.Option[org.apache.mesos.v1.mesos.UdpStatistics] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[SNMPStatistics] with com.trueaccord.lenses.Updatable[SNMPStatistics] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (ipStats.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(ipStats.get.serializedSize) + ipStats.get.serializedSize }
      if (icmpStats.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(icmpStats.get.serializedSize) + icmpStats.get.serializedSize }
      if (tcpStats.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(tcpStats.get.serializedSize) + tcpStats.get.serializedSize }
      if (udpStats.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(udpStats.get.serializedSize) + udpStats.get.serializedSize }
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
      ipStats.foreach { __v =>
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      icmpStats.foreach { __v =>
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      tcpStats.foreach { __v =>
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      udpStats.foreach { __v =>
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.apache.mesos.v1.mesos.SNMPStatistics = {
      var __ipStats = this.ipStats
      var __icmpStats = this.icmpStats
      var __tcpStats = this.tcpStats
      var __udpStats = this.udpStats
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __ipStats = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __ipStats.getOrElse(org.apache.mesos.v1.mesos.IpStatistics.defaultInstance)))
          case 18 =>
            __icmpStats = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __icmpStats.getOrElse(org.apache.mesos.v1.mesos.IcmpStatistics.defaultInstance)))
          case 26 =>
            __tcpStats = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __tcpStats.getOrElse(org.apache.mesos.v1.mesos.TcpStatistics.defaultInstance)))
          case 34 =>
            __udpStats = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __udpStats.getOrElse(org.apache.mesos.v1.mesos.UdpStatistics.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      org.apache.mesos.v1.mesos.SNMPStatistics(
          ipStats = __ipStats,
          icmpStats = __icmpStats,
          tcpStats = __tcpStats,
          udpStats = __udpStats
      )
    }
    def getIpStats: org.apache.mesos.v1.mesos.IpStatistics = ipStats.getOrElse(org.apache.mesos.v1.mesos.IpStatistics.defaultInstance)
    def clearIpStats: SNMPStatistics = copy(ipStats = None)
    def withIpStats(__v: org.apache.mesos.v1.mesos.IpStatistics): SNMPStatistics = copy(ipStats = Some(__v))
    def getIcmpStats: org.apache.mesos.v1.mesos.IcmpStatistics = icmpStats.getOrElse(org.apache.mesos.v1.mesos.IcmpStatistics.defaultInstance)
    def clearIcmpStats: SNMPStatistics = copy(icmpStats = None)
    def withIcmpStats(__v: org.apache.mesos.v1.mesos.IcmpStatistics): SNMPStatistics = copy(icmpStats = Some(__v))
    def getTcpStats: org.apache.mesos.v1.mesos.TcpStatistics = tcpStats.getOrElse(org.apache.mesos.v1.mesos.TcpStatistics.defaultInstance)
    def clearTcpStats: SNMPStatistics = copy(tcpStats = None)
    def withTcpStats(__v: org.apache.mesos.v1.mesos.TcpStatistics): SNMPStatistics = copy(tcpStats = Some(__v))
    def getUdpStats: org.apache.mesos.v1.mesos.UdpStatistics = udpStats.getOrElse(org.apache.mesos.v1.mesos.UdpStatistics.defaultInstance)
    def clearUdpStats: SNMPStatistics = copy(udpStats = None)
    def withUdpStats(__v: org.apache.mesos.v1.mesos.UdpStatistics): SNMPStatistics = copy(udpStats = Some(__v))
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => ipStats.orNull
        case 2 => icmpStats.orNull
        case 3 => tcpStats.orNull
        case 4 => udpStats.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => ipStats.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => icmpStats.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => tcpStats.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 4 => udpStats.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = org.apache.mesos.v1.mesos.SNMPStatistics
}

object SNMPStatistics extends com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.SNMPStatistics] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.SNMPStatistics] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): org.apache.mesos.v1.mesos.SNMPStatistics = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    org.apache.mesos.v1.mesos.SNMPStatistics(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[org.apache.mesos.v1.mesos.IpStatistics]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[org.apache.mesos.v1.mesos.IcmpStatistics]],
      __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[org.apache.mesos.v1.mesos.TcpStatistics]],
      __fieldsMap.get(__fields.get(3)).asInstanceOf[scala.Option[org.apache.mesos.v1.mesos.UdpStatistics]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[org.apache.mesos.v1.mesos.SNMPStatistics] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      org.apache.mesos.v1.mesos.SNMPStatistics(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[scala.Option[org.apache.mesos.v1.mesos.IpStatistics]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[org.apache.mesos.v1.mesos.IcmpStatistics]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[scala.Option[org.apache.mesos.v1.mesos.TcpStatistics]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[scala.Option[org.apache.mesos.v1.mesos.UdpStatistics]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = MesosProto.javaDescriptor.getMessageTypes.get(31)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = MesosProto.scalaDescriptor.messages(31)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => __out = org.apache.mesos.v1.mesos.IpStatistics
      case 2 => __out = org.apache.mesos.v1.mesos.IcmpStatistics
      case 3 => __out = org.apache.mesos.v1.mesos.TcpStatistics
      case 4 => __out = org.apache.mesos.v1.mesos.UdpStatistics
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = org.apache.mesos.v1.mesos.SNMPStatistics(
  )
  implicit class SNMPStatisticsLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.SNMPStatistics]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, org.apache.mesos.v1.mesos.SNMPStatistics](_l) {
    def ipStats: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.IpStatistics] = field(_.getIpStats)((c_, f_) => c_.copy(ipStats = Some(f_)))
    def optionalIpStats: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[org.apache.mesos.v1.mesos.IpStatistics]] = field(_.ipStats)((c_, f_) => c_.copy(ipStats = f_))
    def icmpStats: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.IcmpStatistics] = field(_.getIcmpStats)((c_, f_) => c_.copy(icmpStats = Some(f_)))
    def optionalIcmpStats: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[org.apache.mesos.v1.mesos.IcmpStatistics]] = field(_.icmpStats)((c_, f_) => c_.copy(icmpStats = f_))
    def tcpStats: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.TcpStatistics] = field(_.getTcpStats)((c_, f_) => c_.copy(tcpStats = Some(f_)))
    def optionalTcpStats: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[org.apache.mesos.v1.mesos.TcpStatistics]] = field(_.tcpStats)((c_, f_) => c_.copy(tcpStats = f_))
    def udpStats: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.UdpStatistics] = field(_.getUdpStats)((c_, f_) => c_.copy(udpStats = Some(f_)))
    def optionalUdpStats: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[org.apache.mesos.v1.mesos.UdpStatistics]] = field(_.udpStats)((c_, f_) => c_.copy(udpStats = f_))
  }
  final val IP_STATS_FIELD_NUMBER = 1
  final val ICMP_STATS_FIELD_NUMBER = 2
  final val TCP_STATS_FIELD_NUMBER = 3
  final val UDP_STATS_FIELD_NUMBER = 4
}
