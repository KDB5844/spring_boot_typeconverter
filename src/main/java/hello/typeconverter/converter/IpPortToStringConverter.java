package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import org.springframework.core.convert.converter.Converter;

public class IpPortToStringConverter implements Converter<IpPort, String> {

    @Override
    public String convert(IpPort source) {
        String ip = source.getIp();
        int port = source.getPort();

        return getIpPortFormat(ip, port);
    }

    public static String getIpPortFormat(String ip, int port) {
        return ip + ":" + port;
    }
}
