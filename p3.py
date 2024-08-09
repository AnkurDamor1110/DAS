from graphviz import Digraph

# Create a new directed graph
dot = Digraph(comment='Healthcare System Use Case Diagram')

# Define the actors
dot.node('A', 'Admin', shape='box')
dot.node('D', 'Doctor', shape='box')
dot.node('P', 'Patient/User', shape='box')

# Define use cases for Admin
admin_use_cases = [
    "Login/Register", "Approve Doctor Profile", "Add Medicine",
    "Block User/Doctor", "View Reports/Tracking", "Update Profile",
    "Conduct Online Interview", "View Feedback/Suggestions"
]

# Define use cases for Doctor
doctor_use_cases = [
    "Login/Register", "Schedule Appointments", "Approve Appointments",
    "Conduct Online Consultations", "Manage Prescriptions", "View Reviews",
    "Add Medicine", "Leave Feedback/Suggestions", "Reserved Payment"
]

# Define use cases for Patient/User
patient_use_cases = [
    "Login/Register", "View Doctors", "Book Appointments",
    "Attend Online Consultations", "Leave Reviews", "View Prescriptions",
    "Update Profile", "Apply for Doctor Profile", "Attend Online Interview",
    "Leave Feedback/Suggestions", "Make Payment"
]

# Add use cases for Admin
for use_case in admin_use_cases:
    dot.node(use_case.replace(" ", "_"), use_case, shape='ellipse')
    dot.edge('A', use_case.replace(" ", "_"))

# Add use cases for Doctor
for use_case in doctor_use_cases:
    dot.node(use_case.replace(" ", "_"), use_case, shape='ellipse')
    dot.edge('D', use_case.replace(" ", "_"))

# Add use cases for Patient/User
for use_case in patient_use_cases:
    dot.node(use_case.replace(" ", "_"), use_case, shape='ellipse')
    dot.edge('P', use_case.replace(" ", "_"))

# Save the diagram as a PNG file
diagram_path = "Healthcare_System_Use_Case_Diagram"
dot.render(diagram_path, format='png')

print(f"Use case diagram saved as {diagram_path}.png")
