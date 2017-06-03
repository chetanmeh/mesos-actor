// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package org.apache.mesos.v1.mesos

/** *
  * A request to return some resources occupied by a framework.
  *
  * @param id
  *   This is the same OfferID as found in normal offers, which allows
  *   re-use of some of the OfferID-only messages.
  * @param url
  *   URL for reaching the agent running on the host.  This enables some
  *   optimizations as described in MESOS-3012, such as allowing the
  *   scheduler driver to bypass the master and talk directly with an agent.
  * @param frameworkId
  *   The framework that should release its resources.
  *   If no specifics are provided (i.e. which agent), all the framework's
  *   resources are requested back.
  * @param agentId
  *   Specified if the resources need to be released from a particular agent.
  *   All the framework's resources on this agent are requested back,
  *   unless further qualified by the `resources` field.
  * @param unavailability
  *   This InverseOffer represents a planned unavailability event in the
  *   specified interval.  Any tasks running on the given framework or agent
  *   may be killed when the interval arrives.  Therefore, frameworks should
  *   aim to gracefully terminate tasks prior to the arrival of the interval.
  *  
  *   For reserved resources, the resources are expected to be returned to the
  *   framework after the unavailability interval.  This is an expectation,
  *   not a guarantee.  For example, if the unavailability duration is not set,
  *   the resources may be removed permanently.
  *  
  *   For other resources, there is no guarantee that requested resources will
  *   be returned after the unavailability interval.  The allocator has no
  *   obligation to re-offer these resources to the prior framework after
  *   the unavailability.
  * @param resources
  *   A list of resources being requested back from the framework,
  *   on the agent identified by `agent_id`.  If no resources are specified
  *   then all resources are being requested back.  For the purpose of
  *   maintenance, this field is always empty (maintenance always requests
  *   all resources back).
  */
@SerialVersionUID(0L)
final case class InverseOffer(
    id: org.apache.mesos.v1.mesos.OfferID,
    url: scala.Option[org.apache.mesos.v1.mesos.URL] = None,
    frameworkId: org.apache.mesos.v1.mesos.FrameworkID,
    agentId: scala.Option[org.apache.mesos.v1.mesos.AgentID] = None,
    unavailability: org.apache.mesos.v1.mesos.Unavailability,
    resources: _root_.scala.collection.Seq[org.apache.mesos.v1.mesos.Resource] = _root_.scala.collection.Seq.empty
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[InverseOffer] with com.trueaccord.lenses.Updatable[InverseOffer] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(id.serializedSize) + id.serializedSize
      if (url.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(url.get.serializedSize) + url.get.serializedSize }
      __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(frameworkId.serializedSize) + frameworkId.serializedSize
      if (agentId.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(agentId.get.serializedSize) + agentId.get.serializedSize }
      __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(unavailability.serializedSize) + unavailability.serializedSize
      resources.foreach(resources => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(resources.serializedSize) + resources.serializedSize)
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
      url.foreach { __v =>
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      _output__.writeTag(3, 2)
      _output__.writeUInt32NoTag(frameworkId.serializedSize)
      frameworkId.writeTo(_output__)
      agentId.foreach { __v =>
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      _output__.writeTag(5, 2)
      _output__.writeUInt32NoTag(unavailability.serializedSize)
      unavailability.writeTo(_output__)
      resources.foreach { __v =>
        _output__.writeTag(6, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): org.apache.mesos.v1.mesos.InverseOffer = {
      var __id = this.id
      var __url = this.url
      var __frameworkId = this.frameworkId
      var __agentId = this.agentId
      var __unavailability = this.unavailability
      val __resources = (_root_.scala.collection.immutable.Vector.newBuilder[org.apache.mesos.v1.mesos.Resource] ++= this.resources)
      var __requiredFields0: Long = 0x7L
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __id = _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __id)
            __requiredFields0 &= 0xfffffffffffffffeL
          case 18 =>
            __url = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __url.getOrElse(org.apache.mesos.v1.mesos.URL.defaultInstance)))
          case 26 =>
            __frameworkId = _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __frameworkId)
            __requiredFields0 &= 0xfffffffffffffffdL
          case 34 =>
            __agentId = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __agentId.getOrElse(org.apache.mesos.v1.mesos.AgentID.defaultInstance)))
          case 42 =>
            __unavailability = _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __unavailability)
            __requiredFields0 &= 0xfffffffffffffffbL
          case 50 =>
            __resources += _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, org.apache.mesos.v1.mesos.Resource.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      if (__requiredFields0 != 0L) { throw new _root_.com.google.protobuf.InvalidProtocolBufferException("Message missing required fields.") } 
      org.apache.mesos.v1.mesos.InverseOffer(
          id = __id,
          url = __url,
          frameworkId = __frameworkId,
          agentId = __agentId,
          unavailability = __unavailability,
          resources = __resources.result()
      )
    }
    def withId(__v: org.apache.mesos.v1.mesos.OfferID): InverseOffer = copy(id = __v)
    def getUrl: org.apache.mesos.v1.mesos.URL = url.getOrElse(org.apache.mesos.v1.mesos.URL.defaultInstance)
    def clearUrl: InverseOffer = copy(url = None)
    def withUrl(__v: org.apache.mesos.v1.mesos.URL): InverseOffer = copy(url = Some(__v))
    def withFrameworkId(__v: org.apache.mesos.v1.mesos.FrameworkID): InverseOffer = copy(frameworkId = __v)
    def getAgentId: org.apache.mesos.v1.mesos.AgentID = agentId.getOrElse(org.apache.mesos.v1.mesos.AgentID.defaultInstance)
    def clearAgentId: InverseOffer = copy(agentId = None)
    def withAgentId(__v: org.apache.mesos.v1.mesos.AgentID): InverseOffer = copy(agentId = Some(__v))
    def withUnavailability(__v: org.apache.mesos.v1.mesos.Unavailability): InverseOffer = copy(unavailability = __v)
    def clearResources = copy(resources = _root_.scala.collection.Seq.empty)
    def addResources(__vs: org.apache.mesos.v1.mesos.Resource*): InverseOffer = addAllResources(__vs)
    def addAllResources(__vs: TraversableOnce[org.apache.mesos.v1.mesos.Resource]): InverseOffer = copy(resources = resources ++ __vs)
    def withResources(__v: _root_.scala.collection.Seq[org.apache.mesos.v1.mesos.Resource]): InverseOffer = copy(resources = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => id
        case 2 => url.orNull
        case 3 => frameworkId
        case 4 => agentId.orNull
        case 5 => unavailability
        case 6 => resources
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => id.toPMessage
        case 2 => url.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => frameworkId.toPMessage
        case 4 => agentId.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 5 => unavailability.toPMessage
        case 6 => _root_.scalapb.descriptors.PRepeated(resources.map(_.toPMessage)(_root_.scala.collection.breakOut))
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = org.apache.mesos.v1.mesos.InverseOffer
}

object InverseOffer extends com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.InverseOffer] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[org.apache.mesos.v1.mesos.InverseOffer] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): org.apache.mesos.v1.mesos.InverseOffer = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    org.apache.mesos.v1.mesos.InverseOffer(
      __fieldsMap(__fields.get(0)).asInstanceOf[org.apache.mesos.v1.mesos.OfferID],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[org.apache.mesos.v1.mesos.URL]],
      __fieldsMap(__fields.get(2)).asInstanceOf[org.apache.mesos.v1.mesos.FrameworkID],
      __fieldsMap.get(__fields.get(3)).asInstanceOf[scala.Option[org.apache.mesos.v1.mesos.AgentID]],
      __fieldsMap(__fields.get(4)).asInstanceOf[org.apache.mesos.v1.mesos.Unavailability],
      __fieldsMap.getOrElse(__fields.get(5), Nil).asInstanceOf[_root_.scala.collection.Seq[org.apache.mesos.v1.mesos.Resource]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[org.apache.mesos.v1.mesos.InverseOffer] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      org.apache.mesos.v1.mesos.InverseOffer(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).get.as[org.apache.mesos.v1.mesos.OfferID],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[org.apache.mesos.v1.mesos.URL]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).get.as[org.apache.mesos.v1.mesos.FrameworkID],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[scala.Option[org.apache.mesos.v1.mesos.AgentID]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).get.as[org.apache.mesos.v1.mesos.Unavailability],
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.collection.Seq[org.apache.mesos.v1.mesos.Resource]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = MesosProto.javaDescriptor.getMessageTypes.get(38)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = MesosProto.scalaDescriptor.messages(38)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => __out = org.apache.mesos.v1.mesos.OfferID
      case 2 => __out = org.apache.mesos.v1.mesos.URL
      case 3 => __out = org.apache.mesos.v1.mesos.FrameworkID
      case 4 => __out = org.apache.mesos.v1.mesos.AgentID
      case 5 => __out = org.apache.mesos.v1.mesos.Unavailability
      case 6 => __out = org.apache.mesos.v1.mesos.Resource
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = org.apache.mesos.v1.mesos.InverseOffer(
    id = org.apache.mesos.v1.mesos.OfferID.defaultInstance,
    frameworkId = org.apache.mesos.v1.mesos.FrameworkID.defaultInstance,
    unavailability = org.apache.mesos.v1.mesos.Unavailability.defaultInstance
  )
  implicit class InverseOfferLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.InverseOffer]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, org.apache.mesos.v1.mesos.InverseOffer](_l) {
    def id: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.OfferID] = field(_.id)((c_, f_) => c_.copy(id = f_))
    def url: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.URL] = field(_.getUrl)((c_, f_) => c_.copy(url = Some(f_)))
    def optionalUrl: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[org.apache.mesos.v1.mesos.URL]] = field(_.url)((c_, f_) => c_.copy(url = f_))
    def frameworkId: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.FrameworkID] = field(_.frameworkId)((c_, f_) => c_.copy(frameworkId = f_))
    def agentId: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.AgentID] = field(_.getAgentId)((c_, f_) => c_.copy(agentId = Some(f_)))
    def optionalAgentId: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[org.apache.mesos.v1.mesos.AgentID]] = field(_.agentId)((c_, f_) => c_.copy(agentId = f_))
    def unavailability: _root_.com.trueaccord.lenses.Lens[UpperPB, org.apache.mesos.v1.mesos.Unavailability] = field(_.unavailability)((c_, f_) => c_.copy(unavailability = f_))
    def resources: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[org.apache.mesos.v1.mesos.Resource]] = field(_.resources)((c_, f_) => c_.copy(resources = f_))
  }
  final val ID_FIELD_NUMBER = 1
  final val URL_FIELD_NUMBER = 2
  final val FRAMEWORK_ID_FIELD_NUMBER = 3
  final val AGENT_ID_FIELD_NUMBER = 4
  final val UNAVAILABILITY_FIELD_NUMBER = 5
  final val RESOURCES_FIELD_NUMBER = 6
}
