package com.dsa.practices.cicd.docker;

public class DockerNotes {
    /*
    What is Docker?
    Docker is a containerization platform that allows developers to package applications along with their dependencies into lightweight, portable containers.
    These containers ensure that the application runs the same across different environments, eliminating the "works on my machine" issue.

    Why Do We Need Docker?
    Docker solves several problems related to application deployment, consistency, and scalability:
        ✅ Environment Consistency – Runs the same in dev, test, and production.
        ✅ Faster Deployment – Eliminates lengthy setup processes.
        ✅ Efficient Resource Usage – Containers are lightweight compared to VMs.
        ✅ Isolation – Each application runs in its own container, avoiding dependency conflicts.
        ✅ Scalability – Easily scale applications using Docker Swarm or Kubernetes.
        ✅ CI/CD Integration – Automates testing and deployment in DevOps workflows.


    Diff between Virtualization vs Containerization
    #1. What is Virtualization?
    Virtualization uses Virtual Machines (VMs) to run multiple OS instances on a single physical machine. Each VM includes a full guest OS, libraries,
    and applications, running on a hypervisor (like VMware, VirtualBox, or KVM).
        ✅ Pros of Virtualization:
            ✔ Strong isolation (each VM has its own OS).
            ✔ Can run different OS types (Windows, Linux, etc.).
            ✔ Good for legacy applications.

        ❌ Cons of Virtualization:
            ⛔ Heavyweight – Each VM includes a full OS, consuming more memory & CPU.
            ⛔ Slower startup – VMs take minutes to boot.
            ⛔ Inefficient resource usage – Each VM runs an entire OS, even for small apps.


    #2. What is Containerization?
    Containerization uses Docker or Kubernetes to run multiple applications in isolated containers on the same OS without needing a full guest OS.
    Containers share the host OS kernel, making them lightweight and faster.
        ✅ Pros of Containerization:
            ✔ Lightweight – No full OS, only app + dependencies.
            ✔ Faster startup – Containers start in seconds.
            ✔ Efficient resource usage – Containers share the host OS.
            ✔ Portability – "Works on my machine" issue is solved.
            ✔ Easier scaling – Supports microservices and cloud-native apps.

        ❌ Cons of Containerization:
            ⛔ Less isolation than VMs (containers share the OS kernel).
            ⛔ Limited to the same OS family (Linux containers need Linux OS).


    When to Use What?
    ✅ Use Virtualization (VMs) when:
    1. You need to run different OS types on the same machine.
    2. Strong isolation is required for security reasons.
    3. Running legacy applications that require a full OS.

    ✅ Use Containerization (Docker) when:
    1. You need fast, lightweight, and scalable deployments.
    2. Running microservices or cloud-native applications.
    3. You want consistency across dev, test, and production.


    */
}
