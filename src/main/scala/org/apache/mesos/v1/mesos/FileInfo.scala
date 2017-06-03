// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package org.apache.mesos.v1.mesos

/** *
  * Describes a File.
  *
  * @param path
  *   Absolute path to the file.
  * @param nlink
  *   Number of hard links.
  * @param size
  *   Total size in bytes.
  * @param mtime
  *   Last modification time.
  * @param mode
  *   Represents a file's mode and permission bits. The bits have the same
  *   definition on all systems and is portable.
  * @param uid
  *   User ID of owner.
  * @param gid
  *   Group ID of owner.
  */
@SerialVersionUID(0L)
final case class FileInfo(
    path: String,
    nlink: scala.Option[Int] = None,
    size: scala.Option[Long] = None,
    mtime: scala.Option[org.apache.mesos.v1.mesos.TimeInfo] = None,
    mode: scala.Option[Int] = None,
    uid: scala.Option[String] = None,
    gid: scala.Option[String] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[FileInfo] with com.trueaccord.lenses.Updatable[FileInfo] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, path)
      if (nlink.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(2, nlink.get) }
      if (size.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt64Size(3, size.get) }
      if (mtime.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(mtime.get.serializedSize) + mtime.get.serializedSize }
      if (mode.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(5, mode.get) }
      if (uid.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(6, uid.get) }
      if (gid.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(7, gid.get) }
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
      _output__.writeString(1, path)
      nlink.foreach { __v =>
        _output__.writeInt32(2, __v)
      };
      size.foreach { __v =>
        _output__.writeUInt64(3, __v)
      };
      mtime.foreach { __v =>
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      mode.foreach { __v =>
        _output__.writeUInt32(5, __v)
      };
      uid.foreach { __v =>
        _output__.writeString(6, __v)
      };
      gid.foreach { __v =>
        _output__.writeString(7, __v)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.apache.mesos.v1.mesos.FileInfo = {
      var __path = this.path
      var __nlink = this.nlink
      var __size = this.size
      var __mtime = this.mtime
      var __mode = this.mode
      var __uid = this.uid
      var __gid = this.gid
      var __requiredFields0: Long = 0x1L
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __path = _input__.readString()
            __requiredFields0 &= 0xfffffffffffffffeL
          case 16 =>
            __nlink = Some(_input__.readInt32())
          case 24 =>
            __size = Some(_input__.readUInt64())
          case 34 =>
            __mtime = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __mtime.getOrElse(org.apache.mesos.v1.mesos.TimeInfo.defaultInstance)))
          case 40 =>
            __mode = Some(_input__.readUInt32())
          case 50 =>
            __uid = Some(_input__.readString())
          case 58 =>
            __gid = Some(_input__.readString())
          case tag => _input__.skipField(tag)
        }
      }
      if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
      org.apache.mesos.v1.mesos.FileInfo(
          path = __path,
          nlink = __nlink,
          size = __size,
          mtime = __mtime,
          mode = __mode,
          uid = __uid,
          gid = __gid
      )
    }
    def withPath(__v: String): FileInfo = copy(path = __v)
    def getNlink: Int = nlink.getOrElse(0)
    def clearNlink: FileInfo = copy(nlink = None)
    def withNlink(__v: Int): FileInfo = copy(nlink = Some(__v))
    def getSize: Long = size.getOrElse(0L)
    def clearSize: FileInfo = copy(size = None)
    def withSize(__v: Long): FileInfo = copy(size = Some(__v))
    def getMtime: org.apache.mesos.v1.mesos.TimeInfo = mtime.getOrElse(org.apache.mesos.v1.mesos.TimeInfo.defaultInstance)
    def clearMtime: FileInfo = copy(mtime = None)
    def withMtime(__v: org.apache.mesos.v1.mesos.TimeInfo): FileInfo = copy(mtime = Some(__v))
    def getMode: Int = mode.getOrElse(0)
    def clearMode: FileInfo = copy(mode = None)
    def withMode(__v: Int): FileInfo = copy(mode = Some(__v))
    def getUid: String = uid.getOrElse("")
    def clearUid: FileInfo = copy(uid = None)
    def withUid(__v: String): FileInfo = copy(uid = Some(__v))
    def getGid: String = gid.getOrElse("")
    def clearGid: FileInfo = copy(gid = None)
    def withGid(__v: String): FileInfo = copy(gid = Some(__v))
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => path
        case 2 => nlink.orNull
        case 3 => size.orNull
        case 4 => mtime.orNull
        case 5 => mode.orNull
        case 6 => uid.orNull
        case 7 => gid.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(path)
        case 2 => nlink.map(_root_.scalapb.descriptors.PInt(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => size.map(_root_.scalapb.descriptors.PLong(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 4 => mtime.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 5 => mode.map(_root_.scalapb.descriptors.PInt(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 6 => uid.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 7 => gid.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = org.apache.mesos.v1.mesos.FileInfo
}

object FileInfo extends com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.FileInfo] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.FileInfo] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): org.apache.mesos.v1.mesos.FileInfo = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    org.apache.mesos.v1.mesos.FileInfo(
      __fieldsMap(__fields.get(0)).asInstanceOf[String],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[Int]],
      __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[Long]],
      __fieldsMap.get(__fields.get(3)).asInstanceOf[scala.Option[org.apache.mesos.v1.mesos.TimeInfo]],
      __fieldsMap.get(__fields.get(4)).asInstanceOf[scala.Option[Int]],
      __fieldsMap.get(__fields.get(5)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(6)).asInstanceOf[scala.Option[String]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[org.apache.mesos.v1.mesos.FileInfo] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      org.apache.mesos.v1.mesos.FileInfo(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).get.as[String],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[Int]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[scala.Option[Long]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[scala.Option[org.apache.mesos.v1.mesos.TimeInfo]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[scala.Option[Int]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).flatMap(_.as[scala.Option[String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).flatMap(_.as[scala.Option[String]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = MesosProto.javaDescriptor.getMessageTypes.get(73)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = MesosProto.scalaDescriptor.messages(73)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 4 => __out = org.apache.mesos.v1.mesos.TimeInfo
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = org.apache.mesos.v1.mesos.FileInfo(
    path = ""
  )
  implicit class FileInfoLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.FileInfo]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, org.apache.mesos.v1.mesos.FileInfo](_l) {
    def path: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.path)((c_, f_) => c_.copy(path = f_))
    def nlink: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.getNlink)((c_, f_) => c_.copy(nlink = Some(f_)))
    def optionalNlink: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[Int]] = field(_.nlink)((c_, f_) => c_.copy(nlink = f_))
    def size: _root_.com.trueaccord.lenses.Lens[UpperPB, Long] = field(_.getSize)((c_, f_) => c_.copy(size = Some(f_)))
    def optionalSize: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[Long]] = field(_.size)((c_, f_) => c_.copy(size = f_))
    def mtime: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.TimeInfo] = field(_.getMtime)((c_, f_) => c_.copy(mtime = Some(f_)))
    def optionalMtime: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[org.apache.mesos.v1.mesos.TimeInfo]] = field(_.mtime)((c_, f_) => c_.copy(mtime = f_))
    def mode: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.getMode)((c_, f_) => c_.copy(mode = Some(f_)))
    def optionalMode: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[Int]] = field(_.mode)((c_, f_) => c_.copy(mode = f_))
    def uid: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getUid)((c_, f_) => c_.copy(uid = Some(f_)))
    def optionalUid: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.uid)((c_, f_) => c_.copy(uid = f_))
    def gid: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getGid)((c_, f_) => c_.copy(gid = Some(f_)))
    def optionalGid: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.gid)((c_, f_) => c_.copy(gid = f_))
  }
  final val PATH_FIELD_NUMBER = 1
  final val NLINK_FIELD_NUMBER = 2
  final val SIZE_FIELD_NUMBER = 3
  final val MTIME_FIELD_NUMBER = 4
  final val MODE_FIELD_NUMBER = 5
  final val UID_FIELD_NUMBER = 6
  final val GID_FIELD_NUMBER = 7
}
