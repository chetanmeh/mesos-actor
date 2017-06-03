// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package org.apache.mesos.v1.mesos

/** *
  * Describes the information about (pseudo) TTY that can
  * be attached to a process running in a container.
  */
@SerialVersionUID(0L)
final case class TTYInfo(
    windowSize: scala.Option[org.apache.mesos.v1.mesos.TTYInfo.WindowSize] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[TTYInfo] with com.trueaccord.lenses.Updatable[TTYInfo] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (windowSize.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(windowSize.get.serializedSize) + windowSize.get.serializedSize }
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
      windowSize.foreach { __v =>
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.apache.mesos.v1.mesos.TTYInfo = {
      var __windowSize = this.windowSize
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __windowSize = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __windowSize.getOrElse(org.apache.mesos.v1.mesos.TTYInfo.WindowSize.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      org.apache.mesos.v1.mesos.TTYInfo(
          windowSize = __windowSize
      )
    }
    def getWindowSize: org.apache.mesos.v1.mesos.TTYInfo.WindowSize = windowSize.getOrElse(org.apache.mesos.v1.mesos.TTYInfo.WindowSize.defaultInstance)
    def clearWindowSize: TTYInfo = copy(windowSize = None)
    def withWindowSize(__v: org.apache.mesos.v1.mesos.TTYInfo.WindowSize): TTYInfo = copy(windowSize = Some(__v))
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => windowSize.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => windowSize.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = org.apache.mesos.v1.mesos.TTYInfo
}

object TTYInfo extends com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.TTYInfo] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.TTYInfo] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): org.apache.mesos.v1.mesos.TTYInfo = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    org.apache.mesos.v1.mesos.TTYInfo(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[org.apache.mesos.v1.mesos.TTYInfo.WindowSize]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[org.apache.mesos.v1.mesos.TTYInfo] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      org.apache.mesos.v1.mesos.TTYInfo(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[scala.Option[org.apache.mesos.v1.mesos.TTYInfo.WindowSize]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = MesosProto.javaDescriptor.getMessageTypes.get(59)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = MesosProto.scalaDescriptor.messages(59)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => __out = org.apache.mesos.v1.mesos.TTYInfo.WindowSize
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = org.apache.mesos.v1.mesos.TTYInfo(
  )
  @SerialVersionUID(0L)
  final case class WindowSize(
      rows: Int,
      columns: Int
      ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[WindowSize] with com.trueaccord.lenses.Updatable[WindowSize] {
      @transient
      private[this] var __serializedSizeCachedValue: Int = 0
      private[this] def __computeSerializedValue(): Int = {
        var __size = 0
        __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(1, rows)
        __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(2, columns)
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
        _output__.writeUInt32(1, rows)
        _output__.writeUInt32(2, columns)
      }
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.apache.mesos.v1.mesos.TTYInfo.WindowSize = {
        var __rows = this.rows
        var __columns = this.columns
        var __requiredFields0: Long = 0x3L
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 8 =>
              __rows = _input__.readUInt32()
              __requiredFields0 &= 0xfffffffffffffffeL
            case 16 =>
              __columns = _input__.readUInt32()
              __requiredFields0 &= 0xfffffffffffffffdL
            case tag => _input__.skipField(tag)
          }
        }
        if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
        org.apache.mesos.v1.mesos.TTYInfo.WindowSize(
            rows = __rows,
            columns = __columns
        )
      }
      def withRows(__v: Int): WindowSize = copy(rows = __v)
      def withColumns(__v: Int): WindowSize = copy(columns = __v)
      def getFieldByNumber(__fieldNumber: Int): scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => rows
          case 2 => columns
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PInt(rows)
          case 2 => _root_.scalapb.descriptors.PInt(columns)
        }
      }
      override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
      def companion = org.apache.mesos.v1.mesos.TTYInfo.WindowSize
  }
  
  object WindowSize extends com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.TTYInfo.WindowSize] {
    implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.TTYInfo.WindowSize] = this
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): org.apache.mesos.v1.mesos.TTYInfo.WindowSize = {
      require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
      val __fields = javaDescriptor.getFields
      org.apache.mesos.v1.mesos.TTYInfo.WindowSize(
        __fieldsMap(__fields.get(0)).asInstanceOf[Int],
        __fieldsMap(__fields.get(1)).asInstanceOf[Int]
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[org.apache.mesos.v1.mesos.TTYInfo.WindowSize] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        org.apache.mesos.v1.mesos.TTYInfo.WindowSize(
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).get.as[Int],
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).get.as[Int]
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = org.apache.mesos.v1.mesos.TTYInfo.javaDescriptor.getNestedTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = org.apache.mesos.v1.mesos.TTYInfo.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__fieldNumber)
    def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = org.apache.mesos.v1.mesos.TTYInfo.WindowSize(
      rows = 0,
      columns = 0
    )
    implicit class WindowSizeLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.TTYInfo.WindowSize]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, org.apache.mesos.v1.mesos.TTYInfo.WindowSize](_l) {
      def rows: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.rows)((c_, f_) => c_.copy(rows = f_))
      def columns: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.columns)((c_, f_) => c_.copy(columns = f_))
    }
    final val ROWS_FIELD_NUMBER = 1
    final val COLUMNS_FIELD_NUMBER = 2
  }
  
  implicit class TTYInfoLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.TTYInfo]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, org.apache.mesos.v1.mesos.TTYInfo](_l) {
    def windowSize: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.TTYInfo.WindowSize] = field(_.getWindowSize)((c_, f_) => c_.copy(windowSize = Some(f_)))
    def optionalWindowSize: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[org.apache.mesos.v1.mesos.TTYInfo.WindowSize]] = field(_.windowSize)((c_, f_) => c_.copy(windowSize = f_))
  }
  final val WINDOW_SIZE_FIELD_NUMBER = 1
}
