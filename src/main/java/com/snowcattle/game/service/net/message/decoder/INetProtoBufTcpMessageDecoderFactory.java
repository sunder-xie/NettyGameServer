package com.snowcattle.game.service.net.message.decoder;

import com.snowcattle.game.common.exception.CodecException;
import com.snowcattle.game.service.net.message.AbstractNetProtoBufMessage;
import io.netty.buffer.ByteBuf;

/**
 * Created by jiangwenping on 17/2/3.
 */
public interface INetProtoBufTcpMessageDecoderFactory {
    public AbstractNetProtoBufMessage praseMessage(ByteBuf byteBuf) throws CodecException;
}
