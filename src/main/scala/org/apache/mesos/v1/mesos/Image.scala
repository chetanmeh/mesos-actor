// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package org.apache.mesos.v1.mesos

/** *
  * Describe an image used by tasks or executors. Note that it's only
  * for tasks or executors launched by MesosContainerizer currently.
  *
  * @param appc
  *   Only one of the following image messages should be set to match
  *   the type.
  * @param cached
  *   With this flag set to false, the mesos containerizer will pull
  *   the docker/appc image from the registry even if the image is
  *   already downloaded on the agent.
  */
@SerialVersionUID(0L)
final case class Image(
    `type`: org.apache.mesos.v1.mesos.Image.Type,
    appc: scala.Option[org.apache.mesos.v1.mesos.Image.Appc] = None,
    docker: scala.Option[org.apache.mesos.v1.mesos.Image.Docker] = None,
    cached: scala.Option[Boolean] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Image] with com.trueaccord.lenses.Updatable[Image] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(1, `type`.value)
      if (appc.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(appc.get.serializedSize) + appc.get.serializedSize }
      if (docker.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(docker.get.serializedSize) + docker.get.serializedSize }
      if (cached.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(4, cached.get) }
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
      _output__.writeEnum(1, `type`.value)
      appc.foreach { __v =>
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      docker.foreach { __v =>
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      cached.foreach { __v =>
        _output__.writeBool(4, __v)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.apache.mesos.v1.mesos.Image = {
      var __type = this.`type`
      var __appc = this.appc
      var __docker = this.docker
      var __cached = this.cached
      var __requiredFields0: Long = 0x1L
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __type = org.apache.mesos.v1.mesos.Image.Type.fromValue(_input__.readEnum())
            __requiredFields0 &= 0xfffffffffffffffeL
          case 18 =>
            __appc = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __appc.getOrElse(org.apache.mesos.v1.mesos.Image.Appc.defaultInstance)))
          case 26 =>
            __docker = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __docker.getOrElse(org.apache.mesos.v1.mesos.Image.Docker.defaultInstance)))
          case 32 =>
            __cached = Some(_input__.readBool())
          case tag => _input__.skipField(tag)
        }
      }
      if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
      org.apache.mesos.v1.mesos.Image(
          `type` = __type,
          appc = __appc,
          docker = __docker,
          cached = __cached
      )
    }
    def withType(__v: org.apache.mesos.v1.mesos.Image.Type): Image = copy(`type` = __v)
    def getAppc: org.apache.mesos.v1.mesos.Image.Appc = appc.getOrElse(org.apache.mesos.v1.mesos.Image.Appc.defaultInstance)
    def clearAppc: Image = copy(appc = None)
    def withAppc(__v: org.apache.mesos.v1.mesos.Image.Appc): Image = copy(appc = Some(__v))
    def getDocker: org.apache.mesos.v1.mesos.Image.Docker = docker.getOrElse(org.apache.mesos.v1.mesos.Image.Docker.defaultInstance)
    def clearDocker: Image = copy(docker = None)
    def withDocker(__v: org.apache.mesos.v1.mesos.Image.Docker): Image = copy(docker = Some(__v))
    def getCached: Boolean = cached.getOrElse(true)
    def clearCached: Image = copy(cached = None)
    def withCached(__v: Boolean): Image = copy(cached = Some(__v))
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => `type`.javaValueDescriptor
        case 2 => appc.orNull
        case 3 => docker.orNull
        case 4 => cached.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PEnum(`type`.scalaValueDescriptor)
        case 2 => appc.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => docker.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 4 => cached.map(_root_.scalapb.descriptors.PBoolean(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = org.apache.mesos.v1.mesos.Image
}

object Image extends com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.Image] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.Image] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): org.apache.mesos.v1.mesos.Image = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    org.apache.mesos.v1.mesos.Image(
      org.apache.mesos.v1.mesos.Image.Type.fromValue(__fieldsMap(__fields.get(0)).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber),
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[org.apache.mesos.v1.mesos.Image.Appc]],
      __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[org.apache.mesos.v1.mesos.Image.Docker]],
      __fieldsMap.get(__fields.get(3)).asInstanceOf[scala.Option[Boolean]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[org.apache.mesos.v1.mesos.Image] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      org.apache.mesos.v1.mesos.Image(
        org.apache.mesos.v1.mesos.Image.Type.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).get.as[_root_.scalapb.descriptors.EnumValueDescriptor].number),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[org.apache.mesos.v1.mesos.Image.Appc]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[scala.Option[org.apache.mesos.v1.mesos.Image.Docker]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[scala.Option[Boolean]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = MesosProto.javaDescriptor.getMessageTypes.get(53)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = MesosProto.scalaDescriptor.messages(53)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 2 => __out = org.apache.mesos.v1.mesos.Image.Appc
      case 3 => __out = org.apache.mesos.v1.mesos.Image.Docker
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => org.apache.mesos.v1.mesos.Image.Type
    }
  }
  lazy val defaultInstance = org.apache.mesos.v1.mesos.Image(
    `type` = org.apache.mesos.v1.mesos.Image.Type.APPC
  )
  sealed trait Type extends _root_.com.trueaccord.scalapb.GeneratedEnum {
    type EnumType = Type
    def isAppc: Boolean = false
    def isDocker: Boolean = false
    def companion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[Type] = org.apache.mesos.v1.mesos.Image.Type
  }
  
  object Type extends _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[Type] {
    implicit def enumCompanion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[Type] = this
    @SerialVersionUID(0L)
    case object APPC extends Type {
      val value = 1
      val index = 0
      val name = "APPC"
      override def isAppc: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object DOCKER extends Type {
      val value = 2
      val index = 1
      val name = "DOCKER"
      override def isDocker: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case class Unrecognized(value: Int) extends Type with _root_.com.trueaccord.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.Seq(APPC, DOCKER)
    def fromValue(value: Int): Type = value match {
      case 1 => APPC
      case 2 => DOCKER
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = org.apache.mesos.v1.mesos.Image.javaDescriptor.getEnumTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = org.apache.mesos.v1.mesos.Image.scalaDescriptor.enums(0)
  }
  /** Protobuf for specifying an Appc container image. See:
    * https://github.com/appc/spec/blob/master/spec/aci.md
    *
    * @param name
    *   The name of the image.
    * @param id
    *   An image ID is a string of the format "hash-value", where
    *   "hash" is the hash algorithm used and "value" is the hex
    *   encoded string of the digest. Currently the only permitted
    *   hash algorithm is sha512.
    * @param labels
    *   Optional labels. Suggested labels: "version", "os", and "arch".
    */
  @SerialVersionUID(0L)
  final case class Appc(
      name: String,
      id: scala.Option[String] = None,
      labels: scala.Option[org.apache.mesos.v1.mesos.Labels] = None
      ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Appc] with com.trueaccord.lenses.Updatable[Appc] {
      @transient
      private[this] var __serializedSizeCachedValue: Int = 0
      private[this] def __computeSerializedValue(): Int = {
        var __size = 0
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, name)
        if (id.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, id.get) }
        if (labels.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(labels.get.serializedSize) + labels.get.serializedSize }
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
        _output__.writeString(1, name)
        id.foreach { __v =>
          _output__.writeString(2, __v)
        };
        labels.foreach { __v =>
          _output__.writeTag(3, 2)
          _output__.writeUInt32NoTag(__v.serializedSize)
          __v.writeTo(_output__)
        };
      }
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.apache.mesos.v1.mesos.Image.Appc = {
        var __name = this.name
        var __id = this.id
        var __labels = this.labels
        var __requiredFields0: Long = 0x1L
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 10 =>
              __name = _input__.readString()
              __requiredFields0 &= 0xfffffffffffffffeL
            case 18 =>
              __id = Some(_input__.readString())
            case 26 =>
              __labels = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __labels.getOrElse(org.apache.mesos.v1.mesos.Labels.defaultInstance)))
            case tag => _input__.skipField(tag)
          }
        }
        if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
        org.apache.mesos.v1.mesos.Image.Appc(
            name = __name,
            id = __id,
            labels = __labels
        )
      }
      def withName(__v: String): Appc = copy(name = __v)
      def getId: String = id.getOrElse("")
      def clearId: Appc = copy(id = None)
      def withId(__v: String): Appc = copy(id = Some(__v))
      def getLabels: org.apache.mesos.v1.mesos.Labels = labels.getOrElse(org.apache.mesos.v1.mesos.Labels.defaultInstance)
      def clearLabels: Appc = copy(labels = None)
      def withLabels(__v: org.apache.mesos.v1.mesos.Labels): Appc = copy(labels = Some(__v))
      def getFieldByNumber(__fieldNumber: Int): scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => name
          case 2 => id.orNull
          case 3 => labels.orNull
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PString(name)
          case 2 => id.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
          case 3 => labels.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        }
      }
      override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
      def companion = org.apache.mesos.v1.mesos.Image.Appc
  }
  
  object Appc extends com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.Image.Appc] {
    implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.Image.Appc] = this
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): org.apache.mesos.v1.mesos.Image.Appc = {
      require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
      val __fields = javaDescriptor.getFields
      org.apache.mesos.v1.mesos.Image.Appc(
        __fieldsMap(__fields.get(0)).asInstanceOf[String],
        __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[String]],
        __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[org.apache.mesos.v1.mesos.Labels]]
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[org.apache.mesos.v1.mesos.Image.Appc] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        org.apache.mesos.v1.mesos.Image.Appc(
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).get.as[String],
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[String]]),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[scala.Option[org.apache.mesos.v1.mesos.Labels]])
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = org.apache.mesos.v1.mesos.Image.javaDescriptor.getNestedTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = org.apache.mesos.v1.mesos.Image.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
      var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 3 => __out = org.apache.mesos.v1.mesos.Labels
      }
      __out
    }
    def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = org.apache.mesos.v1.mesos.Image.Appc(
      name = ""
    )
    implicit class AppcLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.Image.Appc]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, org.apache.mesos.v1.mesos.Image.Appc](_l) {
      def name: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.name)((c_, f_) => c_.copy(name = f_))
      def id: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getId)((c_, f_) => c_.copy(id = Some(f_)))
      def optionalId: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.id)((c_, f_) => c_.copy(id = f_))
      def labels: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.Labels] = field(_.getLabels)((c_, f_) => c_.copy(labels = Some(f_)))
      def optionalLabels: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[org.apache.mesos.v1.mesos.Labels]] = field(_.labels)((c_, f_) => c_.copy(labels = f_))
    }
    final val NAME_FIELD_NUMBER = 1
    final val ID_FIELD_NUMBER = 2
    final val LABELS_FIELD_NUMBER = 3
  }
  
  /** @param name
    *   The name of the image. Expected format:
    *     [REGISTRY_HOST[:REGISTRY_PORT]/]REPOSITORY[:TAG|&#64;TYPE:DIGEST]
    *  
    *   See: https://docs.docker.com/reference/commandline/pull/
    * @param credential
    *   Credential to authenticate with docker registry.
    *   NOTE: This is not encrypted, therefore framework and operators
    *   should enable SSL when passing this information.
    *  
    *   This field has never been used in Mesos before and is
    *   deprecated since Mesos 1.3. Please use `config` below
    *   (see MESOS-7088 for details).
    *   Since 1.3.
    * @param config
    *   Docker config containing credentails to authenticate with
    *   docker registry. The secret is expected to be a docker
    *   config file in JSON format with UTF-8 character encoding.
    */
  @SerialVersionUID(0L)
  final case class Docker(
      name: String,
      credential: scala.Option[org.apache.mesos.v1.mesos.Credential] = None,
      config: scala.Option[org.apache.mesos.v1.mesos.Secret] = None
      ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Docker] with com.trueaccord.lenses.Updatable[Docker] {
      @transient
      private[this] var __serializedSizeCachedValue: Int = 0
      private[this] def __computeSerializedValue(): Int = {
        var __size = 0
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, name)
        if (credential.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(credential.get.serializedSize) + credential.get.serializedSize }
        if (config.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(config.get.serializedSize) + config.get.serializedSize }
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
        _output__.writeString(1, name)
        credential.foreach { __v =>
          _output__.writeTag(2, 2)
          _output__.writeUInt32NoTag(__v.serializedSize)
          __v.writeTo(_output__)
        };
        config.foreach { __v =>
          _output__.writeTag(3, 2)
          _output__.writeUInt32NoTag(__v.serializedSize)
          __v.writeTo(_output__)
        };
      }
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.apache.mesos.v1.mesos.Image.Docker = {
        var __name = this.name
        var __credential = this.credential
        var __config = this.config
        var __requiredFields0: Long = 0x1L
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 10 =>
              __name = _input__.readString()
              __requiredFields0 &= 0xfffffffffffffffeL
            case 18 =>
              __credential = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __credential.getOrElse(org.apache.mesos.v1.mesos.Credential.defaultInstance)))
            case 26 =>
              __config = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __config.getOrElse(org.apache.mesos.v1.mesos.Secret.defaultInstance)))
            case tag => _input__.skipField(tag)
          }
        }
        if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
        org.apache.mesos.v1.mesos.Image.Docker(
            name = __name,
            credential = __credential,
            config = __config
        )
      }
      def withName(__v: String): Docker = copy(name = __v)
      def getCredential: org.apache.mesos.v1.mesos.Credential = credential.getOrElse(org.apache.mesos.v1.mesos.Credential.defaultInstance)
      def clearCredential: Docker = copy(credential = None)
      def withCredential(__v: org.apache.mesos.v1.mesos.Credential): Docker = copy(credential = Some(__v))
      def getConfig: org.apache.mesos.v1.mesos.Secret = config.getOrElse(org.apache.mesos.v1.mesos.Secret.defaultInstance)
      def clearConfig: Docker = copy(config = None)
      def withConfig(__v: org.apache.mesos.v1.mesos.Secret): Docker = copy(config = Some(__v))
      def getFieldByNumber(__fieldNumber: Int): scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => name
          case 2 => credential.orNull
          case 3 => config.orNull
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PString(name)
          case 2 => credential.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
          case 3 => config.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        }
      }
      override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
      def companion = org.apache.mesos.v1.mesos.Image.Docker
  }
  
  object Docker extends com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.Image.Docker] {
    implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.Image.Docker] = this
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): org.apache.mesos.v1.mesos.Image.Docker = {
      require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
      val __fields = javaDescriptor.getFields
      org.apache.mesos.v1.mesos.Image.Docker(
        __fieldsMap(__fields.get(0)).asInstanceOf[String],
        __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[org.apache.mesos.v1.mesos.Credential]],
        __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[org.apache.mesos.v1.mesos.Secret]]
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[org.apache.mesos.v1.mesos.Image.Docker] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        org.apache.mesos.v1.mesos.Image.Docker(
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).get.as[String],
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[org.apache.mesos.v1.mesos.Credential]]),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[scala.Option[org.apache.mesos.v1.mesos.Secret]])
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = org.apache.mesos.v1.mesos.Image.javaDescriptor.getNestedTypes.get(1)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = org.apache.mesos.v1.mesos.Image.scalaDescriptor.nestedMessages(1)
    def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
      var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 2 => __out = org.apache.mesos.v1.mesos.Credential
        case 3 => __out = org.apache.mesos.v1.mesos.Secret
      }
      __out
    }
    def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = org.apache.mesos.v1.mesos.Image.Docker(
      name = ""
    )
    implicit class DockerLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.Image.Docker]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, org.apache.mesos.v1.mesos.Image.Docker](_l) {
      def name: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.name)((c_, f_) => c_.copy(name = f_))
      def credential: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.Credential] = field(_.getCredential)((c_, f_) => c_.copy(credential = Some(f_)))
      def optionalCredential: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[org.apache.mesos.v1.mesos.Credential]] = field(_.credential)((c_, f_) => c_.copy(credential = f_))
      def config: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.Secret] = field(_.getConfig)((c_, f_) => c_.copy(config = Some(f_)))
      def optionalConfig: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[org.apache.mesos.v1.mesos.Secret]] = field(_.config)((c_, f_) => c_.copy(config = f_))
    }
    final val NAME_FIELD_NUMBER = 1
    final val CREDENTIAL_FIELD_NUMBER = 2
    final val CONFIG_FIELD_NUMBER = 3
  }
  
  implicit class ImageLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.Image]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, org.apache.mesos.v1.mesos.Image](_l) {
    def `type`: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.Image.Type] = field(_.`type`)((c_, f_) => c_.copy(`type` = f_))
    def appc: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.Image.Appc] = field(_.getAppc)((c_, f_) => c_.copy(appc = Some(f_)))
    def optionalAppc: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[org.apache.mesos.v1.mesos.Image.Appc]] = field(_.appc)((c_, f_) => c_.copy(appc = f_))
    def docker: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.Image.Docker] = field(_.getDocker)((c_, f_) => c_.copy(docker = Some(f_)))
    def optionalDocker: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[org.apache.mesos.v1.mesos.Image.Docker]] = field(_.docker)((c_, f_) => c_.copy(docker = f_))
    def cached: _root_.com.trueaccord.lenses.Lens[UpperPB, Boolean] = field(_.getCached)((c_, f_) => c_.copy(cached = Some(f_)))
    def optionalCached: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[Boolean]] = field(_.cached)((c_, f_) => c_.copy(cached = f_))
  }
  final val TYPE_FIELD_NUMBER = 1
  final val APPC_FIELD_NUMBER = 2
  final val DOCKER_FIELD_NUMBER = 3
  final val CACHED_FIELD_NUMBER = 4
}
