var shapedefs = [
{
	name: "PlaceShape",
	params: {
		size: {width: 40, height: 70},
	},
	shapes: [
		{
			name: "Ellipse",
			params: {
				compartment: {
					locationId: "tokensCompartment",
					layout: "fixed",
					invisible: false,
				},
				size: {width: 40, height: 40},
			},
		},
		{
			name: "Text",
			params: {
				size: {width: 30, height: 30},
				align: {
					horizontal: "left",
					vertical: "top"
				},
			}
		}
		,
	]
}
,
{
	name: "TransitionShape",
	params: {
		size: {width: 40, height: 70},
	},
	shapes: [
		{
			name: "Rectangle",
			params: {
				size: {width: 40, height: 40},
			},
		}
		,
		{
			name: "Text",
			params: {
				size: {width: 30, height: 30},
				align: {
					horizontal: "left",
					vertical: "top"
				},
			}
		}
	]
}
,
{
	name: "TokenShape",
	params: {
		size: {width: 8, height: 8},
	},
	shapes: [
		{
			name: "Ellipse",
			params: {
				size: {width: 8, height: 8},
			},
		}
		,
	]
}
,
{
	name: "ArrowConnectionShape",
	connectionType: "freeform",
	placings: [
		{
			offset: 1.0,
			shape: {
				name: "Polygon",
				params: {
					points: [
						{
							x: -10,
							y: -5,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: 0,
							y: 0,
							curveBefore: 0,
							curveAfter: 0
						},
						{
							x: -10,
							y: 5,
							curveBefore: 0,
							curveAfter: 0
						},
					]
				},
			}
			,
		},
	]
}
,
]
