package com.bakingbitsstudios.persistence;

import com.bakingbitsstudios.data.Host;

import java.util.*;

public class HostDao {
    // TODO: Hook up to actual persistence layer
    private static Map<String, Host> hosts = new HashMap<String, Host>();

    private HostDao() {

    }

    public static Host GetHostById(String id) {
        return hosts.get(id);
    }

    public static List<Host> GetAllHosts() {
        return new ArrayList<Host>(hosts.values());
    }

    public static Host CreateHost(Host host) {
        hosts.put(host.getId(), host);
        return host;
    }

    public static boolean DeleteHost(String id) {
        Host host = hosts.remove(id);
        return host != null;
    }

    public static Host UpdateHost(String id, Host host) {
        hosts.put(id, host);
        return host;
    }
}
