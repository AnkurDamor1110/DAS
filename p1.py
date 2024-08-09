import matplotlib.pyplot as plt
import matplotlib.patches as patches
# Create figure and axes for the use case diagram
fig, ax = plt.subplots(figsize=(20, 15))

# Define positions for actors and use cases
actors = {
    'Admin': (0, 12),
    'Doctor': (0, 7),
    'Patient': (0, 2)
}

use_cases = {
    'Approve Doctor Registration': (10, 12),
    'Manage Doctors': (10, 11),
    'View Reports': (10, 10),
    'Register as Doctor': (10, 8),
    'Update Profile': (10, 7),
    'Schedule Appointments': (10, 6),
    'Conduct Online Consultations': (10, 5),
    'Manage Prescriptions': (10, 4),
    'View Reviews': (10, 3),
    'Register as Patient': (10, 2),
    'Book Appointments': (10, 1),
    'View Doctors': (10, 0),
    'Attend Online Consultations': (10, -1),
    'Leave Reviews': (10, -2),
    'View Prescriptions': (10, -3)
}

# Draw actors
for actor, (x, y) in actors.items():
    ax.text(x, y, actor, fontsize=14, fontweight='bold', ha='right')
    ax.plot([x + 1, x + 3], [y, y], 'k--')

# Draw use cases
for use_case, (x, y) in use_cases.items():
    ax.add_patch(patches.Ellipse((x, y), 6, 1.5, edgecolor='black', facecolor='lightgray'))
    ax.text(x, y, use_case, fontsize=12, ha='center', va='center')

# Draw relationships (arrows)
relationships = [
    ('Admin', 'Approve Doctor Registration'),
    ('Admin', 'Manage Doctors'),
    ('Admin', 'View Reports'),
    ('Doctor', 'Register as Doctor'),
    ('Doctor', 'Update Profile'),
    ('Doctor', 'Schedule Appointments'),
    ('Doctor', 'Conduct Online Consultations'),
    ('Doctor', 'Manage Prescriptions'),
    ('Doctor', 'View Reviews'),
    ('Patient', 'Register as Patient'),
    ('Patient', 'Book Appointments'),
    ('Patient', 'View Doctors'),
    ('Patient', 'Attend Online Consultations'),
    ('Patient', 'Leave Reviews'),
    ('Patient', 'View Prescriptions')
]

for actor, use_case in relationships:
    actor_x, actor_y = actors[actor]
    use_case_x, use_case_y = use_cases[use_case]
    ax.annotate('', xy=(use_case_x - 3, use_case_y), xytext=(actor_x + 3, actor_y),
                arrowprops=dict(arrowstyle='->', lw=1.5, color='blue'))

# Set axis limits and remove axes
ax.set_xlim(-1, 16)
ax.set_ylim(-4, 14)
ax.axis('off')

# Save the use case diagram as a PDF
uml_use_case_pdf_path = "uml_use_case_diagram_v2.pdf"
plt.savefig(uml_use_case_pdf_path, bbox_inches='tight')

# Show the plot
plt.show()

uml_use_case_pdf_path
